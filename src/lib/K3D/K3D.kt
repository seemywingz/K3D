package K3D

import glfw.*
import kotlinx.cinterop.*
import kotlin.system.exitProcess

lateinit var camera: Camera
lateinit var window: Window


fun initK3D( appName: String = "K3D", windowWidth: Int = 640, windowHeight: Int = 480, display: () -> Unit ) {

    window = Window(appName, windowWidth, windowHeight) { display() }

    camera = Camera(windowWidth, windowHeight)

    window.glfwMojaveWorkaround()

    window.mainLoop()

}