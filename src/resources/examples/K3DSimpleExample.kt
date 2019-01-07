import k3d.*
import openGL.*
import kotlinx.cinterop.*

fun main(){

    k3dWindowHint("floating", true)
    val k3dWindow = K3DInit(800, 600, "K3D Object")

    // Build the K3DObject
    val position = K3DVec3(0f,0f,-10f)
    val color = K3DVec3(0f,0f,1f)
    val k3dObject = K3DObject( position, K3DPlane, K3DNoTexture, color, K3DColorShader)

    while ( !k3dWindow.shouldClose() ){

        k3dWindow.update()

        k3dObject.draw()

        k3dWindow.swapBuffers()
    }

    k3dWindow.destroy()
    k3dWindow.terminate()

}
