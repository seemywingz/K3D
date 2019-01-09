import k3d.*
import openGL.*
import kotlinx.cinterop.*

fun main(){

    k3dWindowHint("floating", true)
    val k3dWindow = K3DInit(800, 600, "K3D Object")

    // Build the K3DObject
    val position = K3DVec3(0f,0f,-5f) // X,Y,Z
    val color = K3DVec3(0f,0f,1f)// R,G,B
    val k3dObject = K3DObject( position, K3DPlane, K3DNoTexture, color, K3DColorShader)
    var z = 0f

    while ( !k3dWindow.shouldClose() ){

        k3dWindow.update()

        z -= 0.01f
        k3dObject.position.ptr[2] = z
        k3dObject.draw()

        k3dWindow.swapBuffers()
    }

    k3dWindow.destroy()
    k3dWindow.terminate()

}
