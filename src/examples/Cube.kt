
import K3D.*
import openGL.*
import platform.GLUT.*
import kotlinx.cinterop.*
import platform.OpenGLCommon.*


private var rotation: GLfloat = 0.0f
private val rotationSpeed: GLfloat = 0.08f

fun display(){

    glClear((GL_COLOR_BUFFER_BIT or GL_DEPTH_BUFFER_BIT).convert())

    // Define a viewing transformation
    gluLookAt(4.0, 2.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0)

    // Draw the cube
    glutSolidCube(1.0)

    rotation += rotationSpeed
}

fun main(){

    windowHint("floating", true)
    k3dInit("K3D Spinning Cube", 100, 100) { display() }

}
