
import K3D.*

import kotlinx.cinterop.*
import platform.GLUT.*
import platform.OpenGL.*
import platform.OpenGLCommon.*


private var rotation: GLfloat = 0.0f
private val rotationSpeed: GLfloat = 0.08f

fun displayFun(){
    // Define a viewing transformation
    gluLookAt(4.0, 2.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0)

    // Push and pop the current matrix stack.
    // This causes the translations and rotations of this matrix not to influence others.
    glPushMatrix()
    glColor3f(1.0f, 1.0f, 1.0f)
    glTranslatef(0.0f, 0.0f, 0.0f)
    glRotatef(rotation, 0.0f, 1.0f, 0.0f)

    // Draw the cube
    glutSolidCube(1.0)
    glPopMatrix()

    rotation += rotationSpeed
}

fun main(){
//    K3D.initGLUT("K3D Spinning Cube", 100, 100) { displayFun() }
    K3D.initGLFW("K3D Spinning Cube", 100, 100) { displayFun() }
}
