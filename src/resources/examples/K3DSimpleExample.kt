import k3d.*
import openGL.*
import kotlinx.cinterop.*

fun main(){

    k3dWindowHint("floating", true)
    val k3dWindow = K3DInit(800, 600, "K3D Object")

    // Build the K3DObject
    val position = K3DVec3(0f,0f,-5f) // X,Y,Z
    val color = K3DVec3(1f,0f,1f)// R,G,B
    val k3dObject = K3DObject( position, K3DCube, K3DNoTexture, color, k3dShader["default"])

//    val light = K3DLight(
//        K3DVec3(0f,0f,0f), // position
//        5f, // radius
//        K3DVec3(0.1f,0.1f,0.1f), // ambient
//        K3DVec3(1f,1f,1f), // diffuse
//        K3DVec3(0.1f,0.1f,0.1f)  // specular
//    )

    val light = K3DLight()

    while ( !k3dWindow.shouldClose() ){

        k3dWindow.update()

//        var dz = -0.01f
//        if (light.position.getZ() <= -10f || light.position.getZ() >= -2f){ dz = -dz}
//        light.position.setZ( light.position.getZ() + dz )
        light.update()

        k3dObject.rotation.setY( k3dObject.rotation.getY() + 0.1f )
        k3dObject.draw()

        k3dWindow.swapBuffers()
    }

    k3dWindow.destroy()
    k3dWindow.terminate()

}
