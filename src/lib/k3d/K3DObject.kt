package k3d

import glfw.*
import cglm.*
import openGL.*
import kotlinx.cinterop.*
import kotlin.system.exitProcess

class K3DObject private constructor(val position: K3DPosition, val program: UInt){

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
    val noramalMapID = glGetUniformLocation(program, "NORMAL_MAP")

    var scale = 1

    constructor( position: K3DPosition, points: FloatArray, texture: UInt, color: FloatArray, program: UInt )
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
//    fun translateRotate(): mat4 {
//
//        val model = cPointerOfFloatArray(FloatArray(16))
//        val pos = K3DVec3( this.position.x, this.position.y, this.position.z)
//
//        glm_translate(model, pos.ptr)
//
//        model := mgl32.Translate3D(d.X, d.Y, d.Z).
//        Mul4(mgl32.Scale3D(d.Scale, d.Scale, d.Scale))
//
//        xrotMatrix := mgl32.HomogRotate3DX(mgl32.DegToRad(d.XRotation))
//        yrotMatrix := mgl32.HomogRotate3DY(mgl32.DegToRad(d.YRotation))
//        zrotMatrix := mgl32.HomogRotate3DZ(mgl32.DegToRad(d.ZRotation))
//        final := model.Mul4(xrotMatrix.Mul4(yrotMatrix.Mul4(zrotMatrix)))
//        return model
//    }

    // TODO: Draw the object
//    fun draw(){
//        val modelMatrix := d.translateRotate()
//        val normalMatrix := modelMatrix.Inv().Transpose()
//    }
}