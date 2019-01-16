package k3d

import glfw.*
import cglm.*
import openGL.*
import kotlinx.cinterop.*
import kotlin.system.exitProcess

var k3dLights = 0

class K3DLight(
    val position: K3DVec3,
    var radius: Float = 1f,
    val ambient: K3DVec3,
    val diffuse: K3DVec3,
    val specular: K3DVec3
){

    init {

        k3dLights++
        if ( k3dLights >= K3DMaxLights ) { throw Exception("Too Many Lights: ${K3DMaxLights} max lights allowed") }

    }

    constructor() : this(
        K3DVec3(0f,0f,0f), // position
        10f, // radius
        K3DVec3(0.1f,0.1f,0.1f), // ambient
        K3DVec3(1f,1f,1f), // diffuse
        K3DVec3(0.1f,0.1f,0.1f)  // specular
    ){}

    fun update(){
        var i = 0
        for ( (_, program) in k3dShader) {

            val uniform = "Light[${i++}]"
            val LRadID = glGetUniformLocation(program, uniform+".lightRad")
            val LPosID = glGetUniformLocation(program, uniform+".lightPos")
            val AmbID = glGetUniformLocation(program, uniform+".Iamb")
            val DifID = glGetUniformLocation(program, uniform+".Idif")
            val SpecID = glGetUniformLocation(program, uniform+".Ispec")

            glUseProgram(program)
            glUniform1f(LRadID, radius)
            glUniform3fv(LPosID, 1, position.ptr)
            glUniform3fv(AmbID, 1, ambient.ptr)
            glUniform3fv(DifID, 1, diffuse.ptr)
            glUniform3fv(SpecID, 1, specular.ptr)
        }
    }

}