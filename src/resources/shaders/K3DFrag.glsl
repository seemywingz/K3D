#version 410
const float pi = 3.14159265;
const int maxLights = 100;

uniform sampler2D TEXTURE;
uniform sampler2D NORMAL_MAP;
uniform mat4 MVP, MODEL;

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

vec4 lighColor(LightData light, vec3 N, vec3 V, MaterialData Material, vec3 fragNoraml, vec3 fragPos, vec3 textr){

  vec3 L = normalize(light.lightPos - fragPos);

  float lambertian = max(dot(N,L), 0.0);
  float specular = 0.0;

  if(lambertian > 0.0) {
    vec3 H = normalize(L + V);
    float specAngle = max(dot(H, N), 0.0);
    float x = 100.0;
    float eConservation = ( x + Material.shininess ) / ( x * pi );
    specular = eConservation * pow(specAngle, Material.shininess);
  }
  float diffuse = max(dot(normalize(fragNoraml), normalize(light.lightPos)), 0.0);

  float
    dist = distance(fragPos, light.lightPos),
    att = clamp(1.0 - dist*dist/(light.lightRad*light.lightRad), 0.0, 1.0); att *= att;

  return vec4( att * textr *(light.Iamb +
              lambertian * light.Idif +
              specular * light.Ispec ) ,1);
}

void main() {

  vec3 textr = texture(TEXTURE, fragTexCoord).rgb;
  if (textr == vec3(0,0,0)) {
    // if no texture, set color to white
    textr = vec3(1,1,1);
  }

  vec3 normal = texture(NORMAL_MAP, fragTexCoord).rgb;
  if (normal == vec3(0,0,0)) {
    // if no texture, set color to white
    normal = vec3(1,1,1);
  }
  normal = normalize(normal * 2.0 - 1.0);   

  vec3 N = normalize(fragTBN * normal); 
  vec3 V = normalize(-fragPos);


  if( Light[0].Idif == vec3(0,0,0) ){

     LightData light = LightData(
       100,
       vec3(0.0, 0.0, 0.0),
       vec3(0.1, 0.1, 0.1)*1,
       vec3(0.1, 0.1, 0.1)*5,
       vec3(0.1, 0.1, 0.1)*10
     );
     finalColor += lighColor(light, N, V, Material, fragNoraml, fragPos, textr);

  }else{

    for(int i=0;i<maxLights;++i) {
      finalColor += lighColor(Light[i], N, V, Material, fragNoraml, fragPos, textr);
    }

  }

  vec4 matColor =  vec4((Material.Iamb * Material.Idif * Material.Ispec),1);
  finalColor = matColor * finalColor;
}
