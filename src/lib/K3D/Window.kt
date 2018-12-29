package K3D

import glfw.*
import kotlinx.cinterop.*
import kotlin.system.exitProcess
import platform.OpenGL.*
import kotlinx.cinterop.*
import platform.OpenGLCommon.*

val windowHints =  mutableListOf<GLFWHint>()

class GLFWHint(val hint: Int, val boolVal: Int){
}

fun windowHint(hint: String, boolVal: Boolean ){
    when (hint) {
        "floating" -> windowHints.add(GLFWHint(GLFW_FLOATING, boolVal.toInt()))
        "resizable" -> windowHints.add(GLFWHint(GLFW_RESIZABLE, boolVal.toInt()))
        "visable" -> windowHints.add(GLFWHint(GLFW_VISIBLE, boolVal.toInt()))
        "decorated" -> windowHints.add(GLFWHint(GLFW_DECORATED, boolVal.toInt()))
        "focused" -> windowHints.add(GLFWHint(GLFW_FOCUSED, boolVal.toInt()))
        "auto_iconify" -> windowHints.add(GLFWHint(GLFW_AUTO_ICONIFY, boolVal.toInt()))
        "maximized" -> windowHints.add(GLFWHint(GLFW_MAXIMIZED, boolVal.toInt()))
        else -> { // Note the block
            print("'${hint}' doesn't match any K3D or GLFW window hints")
        }
    }
}

class Window(val appName: String, val windowWidth: Int, val windowHeight: Int, val display: () -> Unit) {

    var glfwWindow: CPointer<GLFWwindow>? = null

    init {

        if (glfwInit() != GLFW_TRUE){
            println("GLFW Initialization Failed")
            exitProcess(100)
        }


        windowHints.forEach{
            glfwWindowHint(it.hint, it.boolVal)
        }

//        glfwWindowHint(GLFW_OPENGL_FORWARD_COMPAT, GL_TRUE);
//        glfwWindowHint(GLFW_OPENGL_PROFILE, GLFW_OPENGL_CORE_PROFILE);
//        glfwWindowHint(GLFW_CONTEXT_VERSION_MAJOR, 3);
//        glfwWindowHint(GLFW_CONTEXT_VERSION_MINOR, 2);

        glfwWindow = glfwCreateWindow(windowWidth, windowHeight, appName, null, null);

        if (glfwWindow == null){
            println("GLFW Window Creation Failed")
            glfwTerminate()
            exitProcess(101)
        }

        glfwMakeContextCurrent(glfwWindow)

        val onResize = staticCFunction({ window: CPointer<GLFWwindow>?, width: Int, height: Int ->
            memScoped {
                camera.setPerspectiveViewport(width, height)
                // re-implement the macOS Mojave workaround unbounded
                val xpos = alloc<IntVar>()
                val ypos = alloc<IntVar>()
                glfwGetWindowPos(window, xpos.ptr, ypos.ptr)
                glfwSetWindowPos(window, xpos.value + 1, ypos.value)
                glfwGetWindowPos(window, xpos.ptr, ypos.ptr)
                glfwSetWindowPos(window, xpos.value - 1, ypos.value)
            }
        })

        glfwSetWindowSizeCallback(glfwWindow, onResize )
    }

    fun glfwMojaveWorkaround(){
        memScoped {
            val xpos = alloc<IntVar>()
            val ypos = alloc<IntVar>()
            glfwGetWindowPos(glfwWindow, xpos.ptr, ypos.ptr)
            glfwSetWindowPos(glfwWindow, xpos.value + 1, ypos.value)
            glfwGetWindowPos(glfwWindow, xpos.ptr, ypos.ptr)
            glfwSetWindowPos(glfwWindow, xpos.value - 1, ypos.value)
        }
    }

    fun mainLoop(){
        while (glfwWindowShouldClose(glfwWindow) != GLFW_TRUE){

            this.display()

            glfwSwapBuffers(glfwWindow)
            glfwPollEvents()
        }

        glfwDestroyWindow(glfwWindow)
        glfwTerminate()
    }

}