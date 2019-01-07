package k3d

import cglm.*
import kotlinx.cinterop.*

class K3DVec3(var x: Float = 0f, var y: Float = 0f, var z: Float = 0f){

    val ptr = nativeHeap.allocArray<FloatVar>(3)

    init {
        ptr[0] = x
        ptr[1] = y
        ptr[2] = z
    }

    fun update(){
        this.x = ptr[0]
        this.y = ptr[1]
        this.z = ptr[2]
    }

    fun print(){
        println()
        println("x: ${this.x}")
        println("y: ${this.y}")
        println("z: ${this.z}")
    }

}

class K3DMat4(val array: FloatArray = FloatArray(16)){

    val ptr = nativeHeap.allocArray<FloatVar>(this.array.size)

    init {
        if (array.size != 16) throw Exception("K3DMat4: Provided FloatArray Not of Size 16")
        glm_mat4_identity(this.ptr)
//        for (i in this.array.indices) {
//            ptr[i] = array[i]
//        }
        update()
    }

    fun update(){
        for (i in this.array.indices) {
            this.array[i] = ptr[i]
        }
    }

    fun print(){
        println()
        this.array.forEach() { println(it) }
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