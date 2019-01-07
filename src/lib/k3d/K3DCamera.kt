package k3d

import cglm.*
import openGL.*
import kotlinx.cinterop.*

class K3DCamera(width: Int, height: Int){

    var speed = 1
    var xRotation = 0f
    var yRotation = 0f
    val MVP = K3DMat4()
    val position = K3DVec3()
    val xRotMatrix = K3DMat4()
    val yRotMatrix = K3DMat4()
    val modelMatrix = K3DMat4()
    val projectionMatrix = K3DMat4()


    init {

        // TODO: print OpenGL Version and Renderer
        println(glGetString(GL_VERSION))
        println(glGetString(GL_RENDERER))

        glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA)
        glEnable(GL_BLEND)

        setPerspective(width, height)

    }


    fun setPerspective(width: Int, height: Int) {

        // Projection matrix :
        //    45° Field of View,
        //    width:height ratio,
        //    display range : 0.1 unit <-> 1000 units
        val ratio = width.toFloat() / height
        glm_perspective(45f, ratio, 0.1f, 1000f, this.projectionMatrix.ptr)

        // this.projectionMatrix.update()
        // println("\nAFTER RESIZE:")
        // this.projectionMatrix.print()

    }

    fun mouseControls(){
    }

    fun keyControls(){

    }

    fun update(){

        glClear((GL_COLOR_BUFFER_BIT or GL_DEPTH_BUFFER_BIT).convert())

        mouseControls()
        keyControls()

        glm_translate(this.modelMatrix.ptr, this.position.ptr)
//        glm_mat4_identity(modelMatrix.ptr)
//
//
//        glm_rotate_x(xRotMatrix.ptr, this.xRotation, xRotMatrix.ptr)
//        glm_rotate_y(yRotMatrix.ptr, this.yRotation, yRotMatrix.ptr)
//
//        val viewMatrix = K3DMat4()
//        glm_mat4_identity(yRotMatrix.ptr)
//        glm_mat4_mul(xRotMatrix.ptr, yRotMatrix.ptr, viewMatrix.ptr)
//
//        glm_mat4_mul(viewMatrix.ptr, modelMatrix.ptr, viewMatrix.ptr)
//
//        glm_mat4_mul(this.projectionMatrix.ptr, viewMatrix.ptr, this.MVP.ptr)

    }

}