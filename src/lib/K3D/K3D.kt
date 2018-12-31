package K3D

import openGL.*
import kotlinx.cinterop.*

fun k3dInit(appName: String, windowWidth: Int, windowHeight: Int): K3DWindow {

    val k3dWindow = k3dCreateWindow(appName, windowWidth, windowHeight)

    // print OpenGL Version and Renderer
    println(glGetString(GL_VERSION))
    println(glGetString(GL_RENDERER))

    glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA)
    glEnable(GL_BLEND)

    k3dPerspective(windowWidth, windowHeight)

    k3dInitShaders()

    return k3dWindow
}

fun k3dPerspective(windowWidth: Int, windowHeight: Int){

    // set the viewport
    glViewport(0, 0, windowWidth, windowHeight)

    val aspect = windowWidth.toDouble() / windowHeight

    // set up a perspective projection matrix
    gluPerspective(45.0, aspect, 1.0, 500.0)

}

// k3dBuildVAO : initializes and returns a vertex array from the points provided.
fun k3dCreateVAO(points:  FloatArray, program: UInt): UInt {

    memScoped {

        var vao = alloc<UIntVar>()

        glGenVertexArrays(1, vao.ptr)
        glBindVertexArray(vao.value)
        println("New VAO: ${vao.value}")

        var vbo = alloc<UIntVar>()
        glGenBuffers(1, vbo.ptr)
        glBindBuffer(GL_ARRAY_BUFFER, vbo.value)
        glBufferData(GL_ARRAY_BUFFER, points.size.toLong() * 4, points.toCValues(), GL_STATIC_DRAW)

        var vertAttrib = glGetAttribLocation(program, "vert").toUInt()
        println("vertAttrib: ${vertAttrib}")
        glEnableVertexAttribArray(vertAttrib)
        glVertexAttribPointer(vertAttrib, 3, GL_FLOAT, GL_FALSE, 11 * 4, cValuesOf(0))

        var vertTexCoordAttrib = glGetAttribLocation(program, "vertTexCoord").toUInt()
        println("vertTexCoordAttrib: ${vertTexCoordAttrib}")
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