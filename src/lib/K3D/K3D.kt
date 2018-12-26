package K3D

import glfw.*
import kotlinx.cinterop.*
import kotlin.system.exitProcess


lateinit var camera: Camera
lateinit var window: Window

fun glfwMojaveWorkaround(){
    println("workaround")
    // TODO: implement the macOS Mojave Workaround
    // macOS Mojave workaround
    // x, y := Window.GetPos()
    // Update()
    // Window.SetPos(x + 1, y)

}

fun initK3D( appName: String = "K3D", windowWidth: Int = 640, windowHeight: Int = 480, display: () -> Unit ) {

    window = Window(appName, windowWidth, windowHeight) { display() }

    camera = Camera(windowWidth, windowHeight)

    glfwMojaveWorkaround()

    window.mainLoop()

}