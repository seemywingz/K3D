package K3D

import kotlinx.cinterop.*
import platform.GLUT.*
import platform.OpenGL.*
import platform.OpenGLCommon.*
import glfw.*

var windowWidth: Int = 0
var windowHeight: Int = 0
var displayLambda: () -> Unit = {}

fun initGL(){
    // select projection matrix
    glMatrixMode(GL_PROJECTION)

    // set the viewport
    glViewport(0, 0, windowWidth, windowHeight)

    // set matrix mode
    glMatrixMode(GL_PROJECTION)

    // reset projection matrix
    glLoadIdentity()
    val aspect = windowWidth.toDouble() / windowHeight

    // set up a perspective projection matrix
    gluPerspective(45.0, aspect, 1.0, 500.0)

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

fun initGLFW( appName: String = "K3D", width: Int = 640, height: Int = 480, display: () -> Unit ) {
    windowWidth = width
    windowHeight = height
    displayLambda = display

    // initialize and run program
    memScoped {
        val argc = alloc<IntVar>().apply { value = 0 }
        glutInit(argc.ptr, null) // TODO: pass real args
    }

    if (glfw.glfwInit() != glfw.GLFW_TRUE){
        println("GLFW Initialization Failed")
    }

    val window = glfw.glfwCreateWindow(windowWidth, windowHeight, appName, null, null);

    if (window == null){
        println("GLFW Window Creation Failed")
    }

    glfw.glfwMakeContextCurrent(window);

    initGL()

    while (glfw.glfwWindowShouldClose(window) != glfw.GLFW_TRUE){
        println("Running")
        glClear((GL_COLOR_BUFFER_BIT or GL_DEPTH_BUFFER_BIT).convert())
        glLoadIdentity()

        displayLambda()

        glfw.glfwSwapBuffers(window);
        glfw.glfwPollEvents();
    }

    glfw.glfwDestroyWindow(window);
    glfw.glfwTerminate();

}

fun displayGL() {
    // Clear Screen and Depth Buffer
    glClear((GL_COLOR_BUFFER_BIT or GL_DEPTH_BUFFER_BIT).convert())
    glLoadIdentity()
    displayLambda()
    glutSwapBuffers()
}

fun initGLUT( appName: String = "K3D", width: Int = 640, height: Int = 480, dispLambda: () -> Unit ) {
    windowWidth = width
    windowHeight = height
    displayLambda = dispLambda

    // initialize and run program
    memScoped {
        val argc = alloc<IntVar>().apply { value = 0 }
        glutInit(argc.ptr, null) // TODO: pass real args
    }

    // Display Mode
    glutInitDisplayMode((GLUT_RGB or GLUT_DOUBLE or GLUT_DEPTH).convert())

    // Set window size
    glutInitWindowSize(windowWidth, windowHeight)

    // create Window
    glutCreateWindow(appName)

    // register Display Function
    glutDisplayFunc(staticCFunction(::displayGL))

    // register Idle Function
    glutIdleFunc(staticCFunction(::displayGL))

    // Initialize OpenGL
    initGL()

    // run GLUT mainloop
    glutMainLoop()
}