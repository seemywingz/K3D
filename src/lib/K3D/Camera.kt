package K3D

import openGL.*
import kotlinx.cinterop.*
//import platform.OpenGLCommon.*

class Camera(val windowWidth: Int = 640, val windowHeight: Int = 480) {

    init {

        // print OpenGL Version and Renderer
        println(glGetString(GL_VERSION))
        println(glGetString(GL_RENDERER))

        glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA)
        glEnable(GL_BLEND)

        setPerspectiveViewport(windowWidth, windowHeight)

    }

    fun setPerspectiveViewport(windowWidth: Int, windowHeight: Int){

        // set the viewport
        glViewport(0, 0, windowWidth, windowHeight)

        val aspect = windowWidth.toDouble() / windowHeight

        // set up a perspective projection matrix
        gluPerspective(45.0, aspect, 1.0, 500.0)

    }
}