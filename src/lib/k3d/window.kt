package k3d

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

fun k3dCreateWindow(windowWidth: Int, windowHeight: Int, windowName: String): K3DWindow {

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

    K3D_WINDOW = glfwCreateWindow(windowWidth, windowHeight, windowName, null, null)

    if (K3D_WINDOW == null) {
        println("GLFW Window Creation Failed")
        glfwTerminate()
        exitProcess(101)
    }

    glfwMakeContextCurrent(K3D_WINDOW)

    val onResize = staticCFunction({ window: CPointer<GLFWwindow>?, width: Int, height: Int ->
        memScoped {
            k3dSetPerspective(width, height)
            k3dWindowMojaveWorkaround(window)
        }
    })

    glfwSetWindowSizeCallback(K3D_WINDOW, onResize)

    return K3D_WINDOW
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