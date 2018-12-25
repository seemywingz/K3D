package TeaPot

import K3D.*

import kotlinx.cinterop.*
import platform.GLUT.*
import platform.OpenGL.*
import platform.OpenGLCommon.*


private var rotation: GLfloat = 0.0f
private val rotationSpeed: GLfloat = 0.2f

fun displayFunction(){
    // Define a viewing transformation
    gluLookAt(4.0, 2.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0)

    // Push and pop the current matrix stack.
    // This causes the translations and rotations of this matrix not to influence others.
    glPushMatrix()
    glColor3f(1.0f, 0.0f, 1.0f)
    glTranslatef(0.0f, 0.0f, 0.0f)
    glRotatef(rotation, 0.0f, 1.0f, 0.0f)
//    glRotatef(90.0f, 0.0f, 1.0f, 0.0f)

    // Draw the teapot
    glutSolidTeapot(1.0)
    glPopMatrix()

    rotation += rotationSpeed
}

fun main(){
    K3D.initialize("K3D Tea Pot") { displayFunction() }
}
