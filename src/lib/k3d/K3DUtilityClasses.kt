package k3d

import cglm.*
import kotlinx.cinterop.*

class K3DVec3(var x: Float = 0f, var y: Float = 0f, var z: Float = 0f){

    val ptr = nativeHeap.allocArrayOf(x, y, z)

    fun set(x: Float, y: Float, z: Float){
        this.ptr[0] = x
        this.ptr[1] = y
        this.ptr[2] = z
    }

    fun setX(x: Float){ this.ptr[0] = x}
    fun setY(y: Float){ this.ptr[1] = y}
    fun setZ(z: Float){ this.ptr[2] = z}

    fun print(){
        println()
        println("x: ${this.ptr[0]}")
        println("y: ${this.ptr[1]}")
        println("z: ${this.ptr[2]}")
    }

}

class K3DMat4(){

    val ptr = nativeHeap.allocArray<FloatVar>(16)

    init {
        glm_mat4_identity(this.ptr)
    }

    fun print(){
        println()
        for (i in 0..15){ println(this.ptr[i])}
    }

    fun free(){
        nativeHeap.free(ptr)
    }

}

data class K3DWindowHint(
    val hint: Int,
    val boolVal: Int
)

data class K3DMesh(
    val materialGroups: Map<String, K3DMaterialGroup>
)

data class K3DMaterialGroup(
    val material: K3DMaterial,
    val faces:     Array<K3DFace>,
    val vao:       UInt,
    val vertCount: Int
)

data class K3DMaterial(
    val name: String,
    val ambient:  K3DVec3,
    val diffuse: K3DVec3,
    val specular: K3DVec3,
    val shininess: Float,
    val diffuseTex: UInt,
    val normalTex:  UInt
)

data class K3DFace(
    val vertID: IntArray = intArrayOf(0),
    val uvid:   IntArray = intArrayOf(0),
    val normalId: IntArray = intArrayOf(0)
)