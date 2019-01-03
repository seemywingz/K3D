import k3d.*
import openGL.*
import kotlinx.cinterop.*

fun main(){

    k3dWindowHint("floating", true)
    val window = k3dInit(500, 500, "K3D Triangle")
    val triangleVAO = k3dCreateVAO( K3DTriangle, K3DBasicShader)

    while ( !window.shouldClose() ){

        window.update()

        glUseProgram(K3DBasicShader)

        glBindVertexArray(triangleVAO)
        glDrawArrays(GL_TRIANGLES, 0, 3)

        window.swapBuffers()
    }

    window.destroy()
    window.terminate()

}
