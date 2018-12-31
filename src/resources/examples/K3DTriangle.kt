import K3D.*
import openGL.*
import kotlinx.cinterop.*

fun main(){

    k3dWindowHint("floating", true)
    val k3dWindow = k3dInit("K3D Triangle", 500, 500)
    val triangleVAO = k3dCreateVAO(K3D_SHAPE_TRIANGLE, K3D_SHADER_BASIC)

    while (k3dWindowShouldClose(k3dWindow)){

        k3dUpdate()

        glUseProgram(K3D_SHADER_BASIC)

        glBindVertexArray(triangleVAO)
        glDrawArrays(GL_TRIANGLES, 0, 3)

        k3dSwapBuffers(k3dWindow)
    }

    k3dDestroyWindow(k3dWindow)
    k3dTerminate()

}
