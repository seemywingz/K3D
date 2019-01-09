package k3d

import cglm.*
import openGL.*
import kotlinx.cinterop.*

class K3DCamera(width: Int, height: Int){

    var speed = 1
    var xRotation = 0f
    var yRotation = 0f
    val position = K3DVec3(0f,0f,1f)
    val projection = K3DMat4()
    val modelViewProjection = K3DMat4()


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
        glm_perspective(glm_rad(45f), ratio, 0.1f, 1000f, this.projection.ptr)
//        println("\nAFTER RESIZE:")
//        this.projection.print()

    }

    fun mouseControls(){
    }

    fun keyControls(){

    }

    fun update(){

        glClear((GL_COLOR_BUFFER_BIT or GL_DEPTH_BUFFER_BIT).convert())

        mouseControls()
        keyControls()

        val model = K3DMat4()

        glm_translate(model.ptr, this.position.ptr)

        // TODO: Calculate Rotation

        glm_mat4_mul(this.projection.ptr, model.ptr, this.modelViewProjection.ptr)
        model.free()

    }

}