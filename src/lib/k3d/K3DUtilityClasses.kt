package k3d

import kotlinx.cinterop.*

abstract class K3DArrayPointer(val array: FloatArray){

    val ptr = nativeHeap.allocArray<FloatVar>(this.array.size)

    init {
        for (i in this.array.indices) {
            ptr[i] = array[i]
        }
    }

    fun update(){
        for (i in this.array.indices) {
            this.array[i] = ptr[i]
        }
    }

    fun print(){
        this.array.forEach() { println(it) }
    }
}

class K3DVec3(array: FloatArray = FloatArray(3)){

    init {
        if (array.size != 3) throw Exception("K3DVec3: Provided FloatArray Not of Size 3")
    }
}

class K3DMat4(array: FloatArray = FloatArray(16)) : K3DArrayPointer(array){

    init {
        if (array.size != 16) throw Exception("K3DMat4: Provided FloatArray Not of Size 16")
    }
}

data class K3DWindowHint(
    val hint: Int,
    val boolVal: Int
)

data class K3DPosition(
    var x: Float = 0f,
    var y: Float = 0f,
    var z: Float = 0f
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
    val ambient:  FloatArray,
    val diffuse: FloatArray,
    val specular: FloatArray,
    val shininess: Float,
    val diffuseTex: UInt,
    val normalTex:  UInt
)

data class K3DFace(
    val vertID: IntArray = intArrayOf(0),
    val uvid:   IntArray = intArrayOf(0),
    val normalId: IntArray = intArrayOf(0)
)