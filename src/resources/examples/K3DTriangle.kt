import k3d.*
import openGL.*
import kotlinx.cinterop.*

fun main(){

    k3dWindowHint("floating", true)
    val window = K3DInit(800, 600, "K3D Triangle")
    val triangle = K3DObject( K3DVec3(0f,0f,-10f), K3DCube, K3DNoTexture, floatArrayOf(1f,1f,1f), K3DBasicShader)
    val triangle1 = K3DObject( K3DVec3(0f,0f,-7f), K3DCube, K3DNoTexture, floatArrayOf(1f,1f,1f), K3DBasicShader)

    while ( !window.shouldClose() ){

        window.update()

        triangle.draw()
        triangle1.draw()

        window.swapBuffers()
    }

    window.destroy()
    window.terminate()

}
