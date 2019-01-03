package k3d

import openGL.*
import cglm.*
import kotlinx.cinterop.*

var k3dProjectionMatrix = K3DMat4( FloatArray(16) )
lateinit var window: K3DWindow

fun k3dInit(windowWidth: Int, windowHeight: Int, windowName: String): K3DWindow {

    window = K3DWindow(windowWidth, windowHeight, windowName)

    // TODO: print OpenGL Version and Renderer
    println(glGetString(GL_VERSION))
    println(glGetString(GL_RENDERER))

    glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA)
    glEnable(GL_BLEND)

    k3dSetPerspective(windowWidth, windowHeight)

    k3dInitShaders()

    return window
}

fun k3dSetPerspective(width: Int, height: Int) {

    // Projection matrix :
    //    45° Field of View,
    //    width:height ratio,
    //    display range : 0.1 unit <-> 1000 units
    val ratio = width.toFloat() / height
    glm_perspective(glm_rad(45.0f), ratio, 0.1f, 1000f, k3dProjectionMatrix.ptr)
    k3dProjectionMatrix.update()
//    println("\nAFTER RESIZE:")
//    k3dProjectionMatrix.print()

}

// k3dBuildVAO : initializes and returns a vertex array from the points provided.
fun k3dCreateVAO(points:  FloatArray, program: UInt): UInt {

    memScoped {

        var vao = alloc<UIntVar>()

        glGenVertexArrays(1, vao.ptr)
        glBindVertexArray(vao.value)

        var vbo = alloc<UIntVar>()
        glGenBuffers(1, vbo.ptr)
        glBindBuffer(GL_ARRAY_BUFFER, vbo.value)
        glBufferData(GL_ARRAY_BUFFER, points.size.toLong() * 4, points.toCValues(), GL_STATIC_DRAW)

        var vertAttrib = glGetAttribLocation(program, "vert").toUInt()
        glEnableVertexAttribArray(vertAttrib)
        glVertexAttribPointer(vertAttrib, 3, GL_FLOAT, GL_FALSE, 11 * 4, cValuesOf(0))

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