package K3D

import glfw.*
import kotlinx.cinterop.*
import kotlin.system.exitProcess

lateinit var camera: Camera
lateinit var window: Window


fun k3dInit( appName: String = "K3D", windowWidth: Int = 640, windowHeight: Int = 480, display: () -> Unit ) {

    window = Window(appName, windowWidth, windowHeight) { display() }

    camera = Camera(windowWidth, windowHeight)

    window.glfwMojaveWorkaround()

    window.mainLoop()

}

// k3dBuildVAO : initializes and returns a vertex array from the points provided.
fun k3dBuildVAO(points:  FloatArray, program: UInt): UInt {

    println("Generating VAO for program: ${program} with points: ${points}")
    val vao: UInt = 0u

//    glGenVertexArrays(1, vao)
//    glBindVertexArray(vao)

    return vao
}