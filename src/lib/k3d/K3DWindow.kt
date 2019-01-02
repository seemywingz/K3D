package k3d

import glfw.*
import openGL.*
import kotlinx.cinterop.*
import kotlin.system.exitProcess

//typealias K3DWindow = CPointer<GLFWwindow>?

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
            print("'${hint}' doesn't match any K3D or GLFW Window hints")
        }
    }
}

class K3DWindow(windowWidth: Int, windowHeight: Int, windowName: String){

    var glfwWindow: CPointer<GLFWwindow>? = null

    init {
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

        glfwWindow = glfwCreateWindow(windowWidth, windowHeight, windowName, null, null)

        if (this.glfwWindow == null) {
            println("GLFW Window Creation Failed")
            glfwTerminate()
            exitProcess(101)
        }

        glfwMakeContextCurrent(this.glfwWindow)

        val onResize = staticCFunction({ window: CPointer<GLFWwindow>?, width: Int, height: Int ->
            memScoped {
                k3dSetPerspective(width, height)
                k3dMojaveWorkaround(window)
            }
        })

        glfwSetWindowSizeCallback(this.glfwWindow, onResize)
    }


    fun shouldClose(): Boolean {
        return glfwWindowShouldClose(this.glfwWindow).toBoolean()
    }


    fun swapBuffers(){
        glfwSwapBuffers(this.glfwWindow)
    }

    fun pollEvents(){
        glfwPollEvents()
    }

    fun update(){
        glfwPollEvents()
        glClear((GL_COLOR_BUFFER_BIT or GL_DEPTH_BUFFER_BIT).convert())
    }

    fun destroy(){
        glfwDestroyWindow(this.glfwWindow)
    }

    fun terminate(){
        glfwTerminate()
    }
}

fun k3dMojaveWorkaround(window: CPointer<GLFWwindow>? ){
    memScoped {
        val xpos = alloc<IntVar>()
        val ypos = alloc<IntVar>()
        glfwGetWindowPos(window, xpos.ptr, ypos.ptr)
        glfwSetWindowPos(window, xpos.value + 1, ypos.value)
        glfwGetWindowPos(window, xpos.ptr, ypos.ptr)
        glfwSetWindowPos(window, xpos.value - 1, ypos.value)
    }
}