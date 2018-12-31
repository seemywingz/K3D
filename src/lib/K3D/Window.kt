package K3D

import glfw.*
import openGL.*
import kotlinx.cinterop.*
import kotlin.system.exitProcess

typealias K3DWindow = CPointer<GLFWwindow>?

var K3D_WINDOW: K3DWindow = null
val windowHints = mutableListOf<GLFWHint>()

class GLFWHint(val hint: Int, val boolVal: Int) {
}

fun k3dWindowHint(hint: String, boolVal: Boolean) {
    when (hint) {
        "floating" -> windowHints.add(GLFWHint(GLFW_FLOATING, boolVal.toInt()))
        "resizable" -> windowHints.add(GLFWHint(GLFW_RESIZABLE, boolVal.toInt()))
        "visable" -> windowHints.add(GLFWHint(GLFW_VISIBLE, boolVal.toInt()))
        "decorated" -> windowHints.add(GLFWHint(GLFW_DECORATED, boolVal.toInt()))
        "focused" -> windowHints.add(GLFWHint(GLFW_FOCUSED, boolVal.toInt()))
        "auto_iconify" -> windowHints.add(GLFWHint(GLFW_AUTO_ICONIFY, boolVal.toInt()))
        "maximized" -> windowHints.add(GLFWHint(GLFW_MAXIMIZED, boolVal.toInt()))
        else -> { // Note the block
            print("'${hint}' doesn't match any K3D or GLFW k3dWindow hints")
        }
    }
}

fun k3dCreateWindow(appName: String, windowWidth: Int, windowHeight: Int): K3DWindow {

    var k3dWindow: K3DWindow

    if (glfwInit() != GL_TRUE) {
        println("GLFW Initialization Failed")
        exitProcess(100)
    }

    windowHints.forEach {
        glfwWindowHint(it.hint, it.boolVal)
    }

    glfwWindowHint(GLFW_OPENGL_FORWARD_COMPAT, GL_TRUE)
    glfwWindowHint(GLFW_OPENGL_PROFILE, GLFW_OPENGL_CORE_PROFILE)
    glfwWindowHint(GLFW_CONTEXT_VERSION_MAJOR, 4)
    glfwWindowHint(GLFW_CONTEXT_VERSION_MINOR, 1)

    k3dWindow = glfwCreateWindow(windowWidth, windowHeight, appName, null, null)
    K3D_WINDOW = k3dWindow

    if (k3dWindow == null) {
        println("GLFW Window Creation Failed")
        glfwTerminate()
        exitProcess(101)
    }

    glfwMakeContextCurrent(k3dWindow)

    val onResize = staticCFunction({ window: CPointer<GLFWwindow>?, _: Int, _: Int ->
        memScoped {
//            k3dCamera.setPerspectiveViewport(width, height)
            // re-implement the macOS Mojave workaround unbounded
            val xpos = alloc<IntVar>()
            val ypos = alloc<IntVar>()
            glfwGetWindowPos(window, xpos.ptr, ypos.ptr)
            glfwSetWindowPos(window, xpos.value + 1, ypos.value)
            glfwGetWindowPos(window, xpos.ptr, ypos.ptr)
            glfwSetWindowPos(window, xpos.value - 1, ypos.value)
        }
    })

    glfwSetWindowSizeCallback(k3dWindow, onResize)

    return k3dWindow
}

fun k3dWindowShouldClose(window: K3DWindow): Boolean {
   return glfwWindowShouldClose(window).toBoolean()
}

fun k3dSwapBuffers(window: K3DWindow){
    glfwSwapBuffers(window)
}

fun k3dPollEvents(){
    glfwPollEvents()
}

fun k3dDestroyWindow(window: K3DWindow){
    glfwDestroyWindow(window)
}

fun k3dTerminate(){
    glfwTerminate()
}

fun k3dWindowMojaveWorkaround(window: K3DWindow ){
    memScoped {
        val xpos = alloc<IntVar>()
        val ypos = alloc<IntVar>()
        glfwGetWindowPos(window, xpos.ptr, ypos.ptr)
        glfwSetWindowPos(window, xpos.value + 1, ypos.value)
        glfwGetWindowPos(window, xpos.ptr, ypos.ptr)
        glfwSetWindowPos(window, xpos.value - 1, ypos.value)
    }
}