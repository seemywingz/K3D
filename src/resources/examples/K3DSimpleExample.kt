import k3d.*
import openGL.*
import kotlinx.cinterop.*

fun main(){

    k3dWindowHint("floating", true)
    val k3dWindow = K3DInit(800, 600, "K3D Object")

    // Build the K3DObject
    val position = K3DVec3(0f,0f,-5f) // X,Y,Z
    val color = K3DVec3(1f,0f,1f)// R,G,B
    val k3dObject = K3DObject( position, K3DCube, K3DNoTexture, color, K3DShader)
    var dz = -0.01f

    while ( !k3dWindow.shouldClose() ){

        k3dWindow.update()

//        if (k3dObject.position.getZ() <= -10f || k3dObject.position.getZ() >= 0.01f){ dz = -dz}
//        k3dObject.position.setZ( k3dObject.position.getZ() + dz )

        k3dObject.rotation.setY( k3dObject.rotation.getY() + 0.1f )
        k3dObject.draw()

        k3dWindow.swapBuffers()
    }

    k3dWindow.destroy()
    k3dWindow.terminate()

}
