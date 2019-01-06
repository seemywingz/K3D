package k3d

import openGL.*
import cglm.*
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
fun k3dCreateVAO(points:  FloatArray, program: UInt): UInt {

    memScoped {

        var vao = alloc<UIntVar>()

        glGenVertexArrays(1, vao.ptr)
        glBindVertexArray(vao.value)
        println("Generating VBO for VAO: ${vao.value}")

        var vbo = alloc<UIntVar>()
        glGenBuffers(1, vbo.ptr)
        glBindBuffer(GL_ARRAY_BUFFER, vbo.value)
        glBufferData(GL_ARRAY_BUFFER, points.size.toLong(), points.toCValues(), GL_STATIC_DRAW)

        var vertAttrib = glGetAttribLocation(program, "vert").toUInt()
        glEnableVertexAttribArray(vertAttrib)
        glVertexAttribPointer(vertAttrib, 3, GL_FLOAT, GL_FALSE, 11 * 4, cPointerOf(0))

        var vertTexCoordAttrib = glGetAttribLocation(program, "vertTexCoord").toUInt()
        glEnableVertexAttribArray(vertTexCoordAttrib)
        glVertexAttribPointer(vertTexCoordAttrib, 2, GL_FLOAT, GL_FALSE, 11 * 4, cValuesOf(3 * 4))

        var vertNormalAttrib = glGetAttribLocation(program, "vertNormal").toUInt()
        glEnableVertexAttribArray(vertNormalAttrib)
        glVertexAttribPointer(vertNormalAttrib, 3, GL_FLOAT, GL_TRUE, 11 * 4, cValuesOf(5 * 4))

        var vertTangentAttrib = glGetAttribLocation(program, "vertTangent").toUInt()
        glEnableVertexAttribArray(vertTangentAttrib)
        glVertexAttribPointer(vertTangentAttrib, 3, GL_FLOAT, GL_TRUE, 11 * 4, cValuesOf(8 * 4))

        return vao.value

    }

}