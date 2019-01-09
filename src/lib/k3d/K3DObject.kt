package k3d

import glfw.*
import cglm.*
import openGL.*
import kotlinx.cinterop.*
import kotlin.system.exitProcess

class K3DObject private constructor(val position: K3DVec3, val program: UInt){

    lateinit var mesh: K3DMesh

    val modelMatrixID = glGetUniformLocation(program, "MODEL")
    val normalMatrixID = glGetUniformLocation(program, "NormalMatrix")
    val mvpid = glGetUniformLocation(program, "MVP")

    val uniform = "Material"
    val IambID = glGetUniformLocation(program, uniform+".Iamb")
    val IdifID = glGetUniformLocation(program, uniform+".Idif")
    val IspecID = glGetUniformLocation(program, uniform+".Ispec")
    val shininessID = glGetUniformLocation(program, uniform+".shininess")
    val textureID = glGetUniformLocation(program, "TEXTURE")
    val normalMapID = glGetUniformLocation(program, "NORMAL_MAP")

    var scale = 1

    constructor( position: K3DVec3, points: FloatArray, texture: UInt, color: K3DVec3, program: UInt )
            : this(position, program) {

        val vao = k3dBuildVAO(points, program)
        val material = K3DMaterial(
            "default",
            color,
            color,
            color,
            1f,
            texture,
            K3DNoTexture
        )
        val mg = K3DMaterialGroup( material, arrayOf(K3DFace()), vao, points.size )
        this.mesh = K3DMesh( mapOf( "default" to mg) )

    }

    // TODO: Finish Drawing the object using camera MVP matrix
    fun draw(){

        val model = K3DMat4()
        glm_translate(model.ptr, this.position.ptr)

        // TODO: Calculate Rotation

        glUseProgram(this.program)
        glUniformMatrix4fv(this.mvpid, 1, GL_FALSE, k3dCamera.modelViewProjection.ptr)
        glUniformMatrix4fv(this.modelMatrixID, 1, GL_FALSE, model.ptr)
        glUniformMatrix4fv(this.normalMatrixID, 1, GL_FALSE, model.ptr)

        for ((_, m) in this.mesh.materialGroups) {
            glUseProgram(this.program)
            glBindVertexArray(m.vao)

            // Material
            glUniform3fv(this.IambID, 1, m.material.ambient.ptr)
            glUniform3fv(this.IspecID, 1, m.material.specular.ptr)
            glUniform3fv(this.IdifID, 1, m.material.diffuse.ptr)
            glUniform1f(this.shininessID, m.material.shininess)

            glUniform1i(this.textureID, 0)
            glUniform1i(this.normalMapID, 1)

            // Bind our diffuse texture in Texture Unit 0
            glActiveTexture(GL_TEXTURE0)
            glBindTexture(GL_TEXTURE_2D, m.material.diffuseTex)

            glActiveTexture(GL_TEXTURE1)
            glBindTexture(GL_TEXTURE_2D, m.material.normalTex)

            glDrawArrays(GL_TRIANGLES, 0, m.vertCount)

            glActiveTexture(GL_TEXTURE0)
            glBindTexture(GL_TEXTURE_2D, 0)
            glActiveTexture(GL_TEXTURE1)
            glBindTexture(GL_TEXTURE_2D, 0)
        }

    }

}