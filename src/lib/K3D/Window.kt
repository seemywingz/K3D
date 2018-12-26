package K3D

import glfw.*
import kotlinx.cinterop.*
import kotlin.system.exitProcess
import platform.OpenGL.*
import kotlinx.cinterop.*
import platform.OpenGLCommon.*


class Window(val appName: String,val windowWidth: Int, val windowHeight: Int, val display: () -> Unit) {

    var glfwWindow: CPointer<GLFWwindow>? = null

    init {

        if (glfwInit() != GLFW_TRUE){
            println("GLFW Initialization Failed")
            exitProcess(100)
        }


        glfwWindow = glfwCreateWindow(windowWidth, windowHeight, appName, null, null);
        glfwWindowHint(GLFW_FLOATING, GLFW_TRUE)

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

}