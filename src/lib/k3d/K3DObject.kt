package k3d

import glfw.*
import cglm.*
import openGL.*
import kotlinx.cinterop.*
import kotlin.system.exitProcess

class K3DObject(val pos: K3DPosition, val points: FloatArray, val texture: UInt, val program: UInt ){

    var vao = k3dCreateVAO(points, program)

    init {

    }
}