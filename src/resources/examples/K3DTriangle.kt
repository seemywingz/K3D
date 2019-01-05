import k3d.*
import openGL.*
import kotlinx.cinterop.*

fun main(){

    k3dWindowHint("floating", true)
    val window = K3DInit(500, 500, "K3D Triangle")
    val triangle = K3DObject( K3DVec3(0f,0f,-10f), K3DCube, K3DNoTexture, floatArrayOf(1f,1f,1f), K3DBasicShader)

    while ( !window.shouldClose() ){

        window.update()

        triangle.draw()

        window.swapBuffers()
    }

    window.destroy()
    window.terminate()

}
