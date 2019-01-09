package k3d

import openGL.*
import kotlinx.cinterop.*
import platform.OpenGLCommon.*
import kotlin.system.exitProcess

var K3DShader: UInt = 0u
var K3DBasicShader: UInt = 0u
var K3DColorShader: UInt = 0u
var K3DCenterLightShader: UInt = 0u

val K3DFragmentShader = """
#version 410
const float pi = 3.14159265;
const int maxLights = 11;

uniform sampler2D TEXTURE;
uniform sampler2D NORMAL_MAP;
uniform mat4 MVP, MODEL;
uniform vec4 COLOR;

in vec3 fragPos;
in vec3 fragNoraml;
in vec2 fragTexCoord;
in mat3 fragTBN;

out vec4 finalColor;

struct MaterialData{
  float shininess;
  vec3
    Iamb,
    Idif,
    Ispec;
};
uniform MaterialData Material;

struct LightData {
  float lightRad;
  vec3
    lightPos,
    Iamb,
    Idif,
    Ispec;
};
uniform LightData Light[maxLights];

float dinstance(vec3 p0, vec3 p1){
  float dx, dy, dz;
  dx = pow((p1.x - p0.x), 2);
  dy = pow((p1.y - p0.y), 2);
  dz = pow((p1.z - p0.z), 2);
  return sqrt((dx+dy+dz));
}

void main() {

  vec3 textr = texture(TEXTURE, fragTexCoord).rgb;
  if (textr == vec3(0,0,0)) {
    // if no texture, set color to white
    textr = vec3(1,1,1);
  }

  vec3 normal = texture(NORMAL_MAP, fragTexCoord).rgb;
  normal = normalize(normal * 2.0 - 1.0);

  vec3 N = normalize(fragTBN * normal);
  vec3 V = normalize(-fragPos);

  for(int i=0;i<maxLights;++i) {
    vec3 L = normalize(Light[i].lightPos - fragPos);

    float lambertian = max(dot(N,L), 0.0);
    float specular = 0.0;

    if(lambertian > 0.0) {
      vec3 H = normalize(L + V);
      float specAngle = max(dot(H, N), 0.0);
      float x = 100.0;
      float eConservation = ( x + Material.shininess ) / ( x * pi );
      specular = eConservation * pow(specAngle, Material.shininess);
    }
    float diffuse = max(dot(normalize(fragNoraml), normalize(Light[i].lightPos)), 0.0);

    float
      dist = distance(fragPos, Light[i].lightPos),
      att = clamp(1.0 - dist*dist/(Light[i].lightRad*Light[i].lightRad), 0.0, 1.0); att *= att;

    finalColor +=  vec4( att * textr *(Light[i].Iamb +
                      lambertian * Light[i].Idif +
                      specular * Light[i].Ispec ) ,1);
  }
  vec4 matColor =  vec4((Material.Iamb * Material.Idif * Material.Ispec),1);
  finalColor = matColor * finalColor;
}

""".trimIndent()
val K3DColorFragmentShader = """
#version 410

struct MaterialData{
  vec3
    Iamb,
    Idif,
    Ispec;
};
uniform MaterialData Material;

out vec4 finalColor;

void main() {
  finalColor = vec4(Material.Idif, 1);
}

""".trimIndent()
val K3DCenterLightFragmentShader = """
#version 410

uniform sampler2D tex;
uniform mat4 MVP, MODEL;
uniform vec4 COLOR;

// TODO: store light data in go program
const vec3 lightPos = vec3(0.0, 0.0, 0.0);
const vec3 Iamb = vec3(0.1, 0.1, 0.1)*1;
const vec3 Idif = vec3(0.1, 0.1, 0.1)*3;
const vec3 Ispec = vec3(0.1, 0.1, 0.1)*10;
const float pi = 3.14159265;

in vec3 fragPos;
in vec3 fragNoraml;
in vec2 fragTexCoord;

out vec4 finalColor;

void main() {
  // TODO: Support multiple light sources
  vec3 L = normalize(lightPos - fragPos);
  vec3 N = normalize(fragNoraml);
  vec3 V = normalize(-fragPos);

  float lambertian = max(dot(N,L), 0.0);
  float specular = 0.0;
  float shininess = 16.0;

  if(lambertian > 0.0) {
    vec3 H = normalize(L + V);
    float specAngle = max(dot(H, N), 0.0);
    float eConservation = ( 8.0 + shininess ) / ( 8.0 * pi );
    specular = eConservation * pow(specAngle, shininess);
  }
  float diffuse = max(dot(normalize(fragNoraml), normalize(lightPos)), 0.0);

  vec3 texture = texture(tex, fragTexCoord).rgb;
  if(texture == vec3(0,0,0)){
    texture = vec3(1,1,1);
  }
  finalColor = COLOR * vec4( texture * (Iamb +
                    lambertian * Idif +
                    specular * Ispec ) ,1);
}

""".trimIndent()

val K3DVertexShader = """
#version 410 core

uniform mat4 MVP, MODEL, NormalMatrix;

in vec3 vert;
in vec2 vertTexCoord;
in vec3 vertNormal;
in vec3 vertTangent;
// in vec3 vertBitangent;

out vec3 fragPos;
out vec2 fragTexCoord;
out vec3 fragNoraml;
out mat3 fragTBN;

void main(){
  vec4 fragPos4 = MODEL * vec4(vert, 1.0);
  fragTexCoord = vertTexCoord;
  fragPos =  fragPos4.xyz / fragPos4.w;
  fragNoraml = (NormalMatrix * vec4(vertNormal, 0.0)).xyz;

  vec3 N = normalize(vec3(MODEL * vec4(vertNormal,    0.0)));
  vec3 T = normalize(vec3(MODEL * vec4(vertTangent,   0.0)));
  // re-orthogonalize T with respect to N
  T = normalize(T - dot(T, N) * N);
  // then retrieve perpendicular vector B with the cross product of T and N
  vec3 B = cross(N, T);
  fragTBN = mat3(T, B, N);


  gl_Position =  MVP * MODEL * vec4(vert, 1.0);
}

""".trimIndent()

// CompileShader : compiles GLSL shader from provided source code
fun k3dCompileShader(shaderType: Int, shaderSourceCode: String): UInt {

    memScoped {

        val shader = glCreateShader(shaderType.toUInt())

        glShaderSource(shader, 1, cValuesOf(shaderSourceCode.cstr.getPointer(memScope)), null)
        glCompileShader(shader)

        val status = alloc<IntVar>()
        glGetShaderiv(shader, GL_COMPILE_STATUS, status.ptr)

        if ( status.value == GL_FALSE ){

            val logLength = alloc<IntVar>()
            glGetShaderiv(shader, GL_INFO_LOG_LENGTH, logLength.ptr)

            val log = "".cstr.getPointer(memScope)
            glGetShaderInfoLog(shader, logLength.value, null, log)

            println("Error Linking Shader Program: ${log.toKString()}")
            exitProcess(200)
        }

        return shader
    }

}

// k3dCreateShader : create openGL shader program from provided GLSL source code
fun k3dCreateShader(vertexSource: String, fragmentSource: String): UInt{

    memScoped {
        val vertexShader = k3dCompileShader(GL_VERTEX_SHADER, vertexSource)
        val fragmentShader = k3dCompileShader(GL_FRAGMENT_SHADER, fragmentSource)

        val program = glCreateProgram()
        glAttachShader(program, vertexShader)
        glAttachShader(program, fragmentShader)
        glLinkProgram(program)


        var status = alloc<IntVar>()
        glGetProgramiv(program, GL_LINK_STATUS, status.ptr)

        if ( status.value == GL_FALSE ){

            var logLength = alloc<IntVar>()
            glGetProgramiv(program, GL_INFO_LOG_LENGTH, logLength.ptr)

            val log = "".cstr.getPointer(memScope)
            glGetProgramInfoLog(program, logLength.value, null, log)

            println("Error Linking Shader Program: ${log.toKString()}")
            exitProcess(201)
        }

        glDeleteShader(vertexShader)
        glDeleteShader(fragmentShader)
        return program
    }
}

fun k3dCreateShaderFromFiles(vertexSourceFile: String, fragmentSourceFile: String): UInt {

    val vertexSource = readFileAsString(vertexSourceFile)
    val fragmentSource = readFileAsString(fragmentSourceFile)

    return k3dCreateShader(vertexSource, fragmentSource)
}

fun k3dInitShaders() {

    K3DShader = k3dCreateShader(K3DVertexShader, K3DFragmentShader)
    K3DCenterLightShader = k3dCreateShader(K3DVertexShader, K3DCenterLightFragmentShader)
    K3DColorShader = k3dCreateShader(K3DVertexShader, K3DColorFragmentShader)
//    K3DBasicShader = k3dCreateShaderFromFiles("./src/resources/shaders/K3DVert.glsl", "./src/resources/shaders/basicFrag.glsl")

}