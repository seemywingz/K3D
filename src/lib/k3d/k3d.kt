package k3d


import glfw.*
import cglm.*
import openGL.*
import kotlinx.cinterop.*
import platform.OpenGLCommon.*

lateinit var k3dWindow: K3DWindow
lateinit var k3dCamera: K3DCamera

fun K3DInit(windowWidth: Int, windowHeight: Int, windowName: String): K3DWindow {

    k3dWindow = K3DWindow(windowWidth, windowHeight, windowName)

    k3dCamera = K3DCamera(windowWidth, windowHeight)

    k3dInitShaders()

    return k3dWindow
}

// k3dBuildVAO : initializes and returns a vertex array from the points provided.
fun k3dBuildVAO(points:  FloatArray, program: UInt): UInt {

    var vao = nativeHeap.alloc<UIntVar>()

    glGenVertexArrays(1, vao.ptr)
    glBindVertexArray(vao.value)

    val vbo = nativeHeap.alloc<UIntVar>()
    glGenBuffers(1, vbo.ptr)
    glBindBuffer(GL_ARRAY_BUFFER, vbo.value)
    glBufferData(GL_ARRAY_BUFFER, points.size * sizeOf<FloatVar>(), points.toCValues(), GL_STATIC_DRAW)

    var vertAttrib = glGetAttribLocation(program, "vert").toUInt()
    glEnableVertexAttribArray(vertAttrib)
    println("vertAttrib: $vertAttrib")
    glVertexAttribPointer(vertAttrib, 3, GL_FLOAT, GL_FALSE, 11 * sizeOf<FloatVar>().toInt(), null)

    var vertTexCoordAttrib = glGetAttribLocation(program, "vertTexCoord").toUInt()
    glEnableVertexAttribArray(vertTexCoordAttrib)
    glVertexAttribPointer(vertTexCoordAttrib, 2, GL_FLOAT, GL_FALSE, 11 * sizeOf<FloatVar>().toInt(), cValuesOf(3 * 4))

    var vertNormalAttrib = glGetAttribLocation(program, "vertNormal").toUInt()
    glEnableVertexAttribArray(vertNormalAttrib)
    glVertexAttribPointer(vertNormalAttrib, 3, GL_FLOAT, GL_TRUE, 11 * sizeOf<FloatVar>().toInt(), cValuesOf(5 * 4))

    var vertTangentAttrib = glGetAttribLocation(program, "vertTangent").toUInt()
    glEnableVertexAttribArray(vertTangentAttrib)
    glVertexAttribPointer(vertTangentAttrib, 3, GL_FLOAT, GL_TRUE, 11 * sizeOf<FloatVar>().toInt(), cValuesOf(8 * 4))

    return vao.value

}