import k3d.*
import openGL.*
import kotlinx.cinterop.*

fun main(){

    k3dWindowHint("floating", true)
    val window = K3DInit(800, 600, "K3D Triangle")
    val triangle = K3DObject( K3DVec3(0f,0f,-10f), K3DTriangle, K3DNoTexture, floatArrayOf(0f,0f,1f), K3DColorShader)

    while ( !window.shouldClose() ){

        window.update()

        triangle.draw()

        window.swapBuffers()
    }

    window.destroy()
    window.terminate()

}
