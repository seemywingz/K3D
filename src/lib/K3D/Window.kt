package K3D

import glfw.*
import kotlinx.cinterop.*
import kotlin.system.exitProcess
import platform.OpenGL.*
import kotlinx.cinterop.*
import platform.OpenGLCommon.*

val windowHints =  mutableListOf<WindowHint>()

class WindowHint(val hint: Int, val boolVal: Int){
}

fun windowHint(hint: String, boolVal: Boolean ){
    when (hint) {
        "floating" -> windowHints.add(WindowHint(GLFW_FLOATING, boolVal.toInt()))
        "resizable" -> windowHints.add(WindowHint(GLFW_RESIZABLE, boolVal.toInt()))
        "visable" -> windowHints.add(WindowHint(GLFW_VISIBLE, boolVal.toInt()))
        "decorated" -> windowHints.add(WindowHint(GLFW_DECORATED, boolVal.toInt()))
        "focused" -> windowHints.add(WindowHint(GLFW_FOCUSED, boolVal.toInt()))
        "auto_iconify" -> windowHints.add(WindowHint(GLFW_AUTO_ICONIFY, boolVal.toInt()))
        "maximized" -> windowHints.add(WindowHint(GLFW_MAXIMIZED, boolVal.toInt()))
        else -> { // Note the block
            print("'${hint}' doesn't match any K3D or GLFW window hints")
        }
    }
}

class Window(val appName: String,val windowWidth: Int, val windowHeight: Int, val display: () -> Unit) {

    var glfwWindow: CPointer<GLFWwindow>? = null

    init {

        if (glfwInit() != GLFW_TRUE){
            println("GLFW Initialization Failed")
            exitProcess(100)
        }


        windowHints.forEach{
            glfwWindowHint(it.hint, it.boolVal)
        }

        glfwWindow = glfwCreateWindow(windowWidth, windowHeight, appName, null, null);

        if (glfwWindow == null){
            println("GLFW Window Creation Failed")
            exitProcess(101)
        }

        glfwMakeContextCurrent(glfwWindow)
    }

    fun mainLoop(){
        while (glfwWindowShouldClose(glfwWindow) != GLFW_TRUE){

            this.display()

            glfwSwapBuffers(glfwWindow);
            glfwPollEvents();
        }

        glfwDestroyWindow(glfwWindow);
        glfwTerminate();
    }

    fun glfwMojaveWorkaround(){
        var xpos: IntVar = nativeHeap.alloc<IntVar>()
        var ypos: IntVar = nativeHeap.alloc<IntVar>()
        glfwGetWindowPos(glfwWindow, xpos.ptr, ypos.ptr)
        glfwSetWindowPos(glfwWindow, xpos.value + 1, ypos.value)
    }

}