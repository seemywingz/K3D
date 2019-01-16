package k3d

import glfw.*
import cglm.*
import openGL.*
import kotlinx.cinterop.*
import kotlin.system.exitProcess

class K3DObject private constructor(val position: K3DVec3, val program: UInt?){

    lateinit var mesh: K3DMesh

    val mvpid = glGetUniformLocation(program!!, "MVP")
    val colorID = glGetUniformLocation(program!!, "COLOR")
    val modelMatrixID = glGetUniformLocation(program!!, "MODEL")
    val normalMatrixID = glGetUniformLocation(program!!, "NormalMatrix")

    val uniform = "Material"
    val IambID = glGetUniformLocation(program!!, uniform+".Iamb")
    val IdifID = glGetUniformLocation(program!!, uniform+".Idif")
    val IspecID = glGetUniformLocation(program!!, uniform+".Ispec")
    val shininessID = glGetUniformLocation(program!!, uniform+".shininess")
    val textureID = glGetUniformLocation(program!!, "TEXTURE")
    val normalMapID = glGetUniformLocation(program!!, "NORMAL_MAP")

    val model = K3DMat4()
    val rotation = K3DVec3()

    var scale = 1

    constructor( position: K3DVec3, points: FloatArray, texture: UInt, color: K3DVec3, program: UInt? )
            : this(position, program) {

        val vao = k3dBuildVAO(points, program!!)
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

    fun draw(){

        glm_mat4_identity(model.ptr)
        glm_translate(model.ptr, position.ptr)

        // TODO: Calculate Rotation
        glm_rotate_x(model.ptr, glm_rad(rotation.getX()), model.ptr)
        glm_rotate_y(model.ptr, glm_rad(rotation.getY()), model.ptr)
        glm_rotate_z(model.ptr, glm_rad(rotation.getZ()), model.ptr)

        glUseProgram(program!!)
        glUniformMatrix4fv(mvpid, 1, GL_FALSE, k3dCamera.modelViewProjection.ptr)
        glUniformMatrix4fv(modelMatrixID, 1, GL_FALSE, model.ptr)

        glm_mat4_inv(model.ptr, model.ptr)
        glm_mat4_transpose(model.ptr)
        glUniformMatrix4fv(normalMatrixID, 1, GL_FALSE, model.ptr)

        for ((_, m) in mesh.materialGroups) {
            glUseProgram(program)
            glBindVertexArray(m.vao)

            // Material
            glUniform3fv(IambID, 1, m.material.ambient.ptr)
            glUniform3fv(IspecID, 1, m.material.specular.ptr)
            glUniform3fv(IdifID, 1, m.material.diffuse.ptr)
            glUniform1f(shininessID, m.material.shininess)

            glUniform1i(textureID, 0)
            glUniform1i(normalMapID, 1)

            // Bind our diffuse texture in Texture Unit 0
            glActiveTexture(GL_TEXTURE0)
            glBindTexture(GL_TEXTURE_2D, m.material.diffuseTex)

            // Bind our normal texture in Texture Unit 1
            glActiveTexture(GL_TEXTURE1)
            glBindTexture(GL_TEXTURE_2D, m.material.normalTex)

            glDrawArrays(GL_TRIANGLES, 0, m.vertCount)

            // clear the bound textures
            glActiveTexture(GL_TEXTURE0)
            glBindTexture(GL_TEXTURE_2D, 0)
            glActiveTexture(GL_TEXTURE1)
            glBindTexture(GL_TEXTURE_2D, 0)
        }

    }

}