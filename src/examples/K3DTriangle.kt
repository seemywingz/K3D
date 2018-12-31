import K3D.*
import openGL.*
import kotlinx.cinterop.*

var triangleVAO: UInt = 0u
val trianglePoints = floatArrayOf(
    -1f, -1f, 0f, 1f, 0f, 0f, 0f, 1f, 0f, 0f, 0f,
    0f, 1f, 0f, 0f, 0f, 0f, 0f, 1f, 0f, 0f, 0f,
    1f, -1f, 0f, 1f, 1f, 0f, 0f, 1f, 0f, 0f, 0f
)

fun main(){


    k3dWindowHint("floating", true)
    val k3dWindow = k3dInit("K3D Triangle", 500, 500)

    triangleVAO = k3dCreateVAO(trianglePoints, K3D_SHADER_BASIC)
    println("triangleVAO: ${triangleVAO}")


    while (k3dWindowShouldClose(k3dWindow)){

        glClear((GL_COLOR_BUFFER_BIT or GL_DEPTH_BUFFER_BIT).convert())

        glUseProgram(K3D_SHADER_BASIC);

        glBindVertexArray(triangleVAO);
        glDrawArrays(GL_TRIANGLES, 0, 3);

        k3dSwapBuffers(k3dWindow)
        k3dPollEvents()
    }

    k3dDestroyWindow(k3dWindow)
    k3dTerminate()

}
