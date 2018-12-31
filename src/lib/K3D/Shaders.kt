package K3D

import openGL.*
import kotlinx.cinterop.*
import platform.OpenGLCommon.*
import kotlin.system.exitProcess

var K3D_SHADER_BASIC: UInt = 0u

val K3D_SHADER_BASIC_FRAG = """
#version 410

out vec4 finalColor;

void main() {
  finalColor = vec4(1, 1, 1, 1);
}

""".trimIndent()

val K3D_SHADER_VERTEX = """
#version 410 core

uniform mat4 MVP, MODEL, NormalMatrix;

in vec3 vert;
in vec2 vertTexCoord;
in vec3 vertNormal;

out vec3 fragPos;
out vec2 fragTexCoord;
out vec3 fragNoraml;

void main(){
  vec4 fragPos4 = MODEL * vec4(vert, 1.0);

  fragTexCoord = vertTexCoord;
  fragPos =  fragPos4.xyz / fragPos4.w;
  fragNoraml = (NormalMatrix * vec4(vertNormal, 0.0)).xyz;

  gl_Position =  MVP * MODEL * vec4(vert, 1.0);
}

""".trimIndent()


// CompileShader : compiles GLSL shader from provided source code
fun compileShader(shaderType: Int, shaderSourceCode: String): UInt {

    memScoped {

        val shader = glCreateShader(shaderType.toUInt())

        glShaderSource(shader, 1, cValuesOf(shaderSourceCode.cstr.getPointer(memScope)), null)
        glCompileShader(shader)

        val status = alloc<IntVar>()
        glGetShaderiv(shader, GL_COMPILE_STATUS, status.ptr)

        if ( status.value == GL_FALSE ){

            var logLength = alloc<IntVar>()
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
        val vertexShader = compileShader(GL_VERTEX_SHADER, vertexSource)
        val fragmentShader = compileShader(GL_FRAGMENT_SHADER, fragmentSource)

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

    println(vertexSource)
    return k3dCreateShader(vertexSource, fragmentSource)
}

fun k3dInitShaders() {

    K3D_SHADER_BASIC = k3dCreateShaderFromFiles("./src/resources/shaders/Vert.glsl", "./src/resources/shaders/basicFrag.glsl")
//    K3D_SHADER_BASIC = k3dCreateShader(K3D_SHADER_VERTEX, K3D_SHADER_BASIC_FRAG)

}