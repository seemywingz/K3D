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

    constructor( position: K3DVec3, points: FloatArray, texture: UInt, color: FloatArray, program: UInt )
            : this(position, program) {

        val vao = k3dCreateVAO(points, program)
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

    // TODO: add mat4 matrix translation and rotation
    fun translateRotate(): K3DMat4 {


        val modelMatrix = K3DMat4()
        modelMatrix.print()
        glm_translate(modelMatrix.ptr, this.position.ptr)
        modelMatrix.update()
        modelMatrix.print()

        // TODO: Apply Local Scaling When Calculating translation for k3dobject
//        glm_mat4_mul(modelMatrix.ptr, K3DVect3())

        // TODO: Aplly local rotation to k3dobject
//          val xrotMatrix = K3DMat4()
//          val yrotMatrix = K3DMat4()
//          val zrotMatrix = K3DMat4()
//        xrotMatrix := mgl32.HomogRotate3DX(mgl32.DegToRad(d.XRotation))
//        yrotMatrix := mgl32.HomogRotate3DY(mgl32.DegToRad(d.YRotation))
//        zrotMatrix := mgl32.HomogRotate3DZ(mgl32.DegToRad(d.ZRotation))
//        final := modelMatrix.Mul4(xrotMatrix.Mul4(yrotMatrix.Mul4(zrotMatrix)))
        return modelMatrix

    }

    // TODO: Finish Drawing the object
    fun draw(){

        var modelMatrix = translateRotate()
        val normalMatrix = K3DMat4()
        glm_mat4_inv(modelMatrix.ptr, normalMatrix.ptr)
        normalMatrix.update()
        glm_mat4_transpose(normalMatrix.ptr)
        normalMatrix.update()

        glUseProgram(this.program)
        glUniformMatrix4fv(this.mvpid, 1, GL_FALSE, k3dCamera.MVP.ptr)
        glUniformMatrix4fv(modelMatrixID, 1, GL_FALSE, modelMatrix.ptr)
        glUniformMatrix4fv(normalMatrixID, 1, GL_FALSE, normalMatrix.ptr)

        for ((_, m) in this.mesh.materialGroups) {
            glUseProgram(this.program)
            glBindVertexArray(m.vao)


            // Material
            glUniform3fv(this.IambID, 1, m.material.ambient.toCValues())
            glUniform3fv(this.IspecID, 1, m.material.specular.toCValues())
            glUniform3fv(this.IdifID, 1, m.material.diffuse.toCValues())
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