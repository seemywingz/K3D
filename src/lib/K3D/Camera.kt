package K3D

import platform.OpenGL.*
import kotlinx.cinterop.*
import platform.OpenGLCommon.*

class Camera(val windowWidth: Int = 640, val windowHeight: Int = 480) {

    init {

        // print OpenGL Version
        println(glGetString(GL_VERSION))

        // select projection matrix
        glMatrixMode(GL_PROJECTION)

        setPerspectiveViewport(windowWidth, windowHeight)

        // specify which matrix is the current matrix
        glMatrixMode(GL_MODELVIEW)
        glShadeModel(GL_SMOOTH)

        // specify the clear value for the depth buffer
        glClearDepth(1.0)
        glEnable(GL_DEPTH_TEST)
        glDepthFunc(GL_LEQUAL)

        // specify implementation-specific hints
        glHint(GL_PERSPECTIVE_CORRECTION_HINT, GL_NICEST)

        glLightModelfv(GL_LIGHT_MODEL_AMBIENT, cValuesOf(0.1f, 0.1f, 0.1f, 1.0f))
        glLightfv(GL_LIGHT0, GL_DIFFUSE, cValuesOf(0.6f, 0.6f, 0.6f, 1.0f))
        glLightfv(GL_LIGHT0, GL_SPECULAR, cValuesOf(0.7f, 0.7f, 0.7f, 1.0f))

        glEnable(GL_LIGHT0)
        glEnable(GL_COLOR_MATERIAL)
        glShadeModel(GL_SMOOTH)
        glLightModeli(GL_LIGHT_MODEL_TWO_SIDE, GL_FALSE)
        glDepthFunc(GL_LEQUAL)
        glEnable(GL_DEPTH_TEST)
        glEnable(GL_LIGHTING)
        glEnable(GL_LIGHT0)
        glClearColor(0.0f, 0.0f, 0.0f, 1.0f)
    }

    fun setPerspectiveViewport(windowWidth: Int, windowHeight: Int){
        // set the viewport
        glViewport(0, 0, windowWidth, windowHeight)

        // set matrix mode
        glMatrixMode(GL_PROJECTION)

        // reset projection matrix
        glLoadIdentity()
        val aspect = windowWidth.toDouble() / windowHeight

        // set up a perspective projection matrix
        gluPerspective(45.0, aspect, 1.0, 500.0)

        /// Important!!! You need to switch back to the model-view matrix
        /// or else your OpenGL calls are modifying the projection matrix!
        glMatrixMode(GL_MODELVIEW); // return to the model matrix
        glLoadIdentity();           // load an identity matrix into the model-view matrix
    }
}