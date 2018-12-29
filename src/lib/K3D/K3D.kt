package K3D

import glfw.*
import openGL.*
import kotlinx.cinterop.*
import platform.OpenGLCommon.*
import kotlin.system.exitProcess

lateinit var camera: Camera
lateinit var window: Window


fun k3dInit( appName: String = "K3D", windowWidth: Int = 640, windowHeight: Int = 480, display: () -> Unit ) {

    window = Window(appName, windowWidth, windowHeight) { display() }

    camera = Camera(windowWidth, windowHeight)

    window.glfwMojaveWorkaround()

    window.mainLoop()

}

// k3dBuildVAO : initializes and returns a vertex array from the points provided.
fun k3dBuildVAO(points:  FloatArray, program: UInt): UInt {

    println("Generating VAO for program: ${program} with points: ${points}")

    var vao: UInt = 0u

    glGenVertexArrays(1, cValuesOf(vao))
    glBindVertexArray(vao)

    var vbo: UInt = 0u
    glGenBuffers(1, cValuesOf(vbo))
    glBindBuffer(GL_ARRAY_BUFFER, vbo)
    glBufferData(GL_ARRAY_BUFFER, points.size.toLong() * 4, points.toCValues(), GL_STATIC_DRAW)

    var vertAttrib = glGetAttribLocation(program, "vert\\x00") as UInt
    glEnableVertexAttribArray(vertAttrib)
    glVertexAttribPointer(vertAttrib, 3, GL_FLOAT, 1.toUByte(), 11*4, cValuesOf(0))

    var vertTexCoordAttrib = glGetAttribLocation(program, "vertTexCoord\\x00") as UInt
    glEnableVertexAttribArray(vertTexCoordAttrib)
    glVertexAttribPointer(vertTexCoordAttrib, 2, GL_FLOAT, 1.toUByte(), 11*4, cValuesOf(3*4))

    var vertNormalAttrib = glGetAttribLocation(program, "vertNormal\\x00") as UInt
    glEnableVertexAttribArray(vertNormalAttrib)
    glVertexAttribPointer(vertNormalAttrib, 3, GL_FLOAT, 0.toUByte(), 11*4, cValuesOf(5*4))

    var vertTangentAttrib = glGetAttribLocation(program, "vertTangent\\x00") as UInt
    glEnableVertexAttribArray(vertTangentAttrib)
    glVertexAttribPointer(vertTangentAttrib, 3, GL_FLOAT, 0.toUByte(), 11*4, cValuesOf(8*4))

    return vao
}

// CompileShader :
fun compileShader(shaderType: UInt, source: String): UInt {

    val shader = glCreateShader(shaderType)
//    val cString = source.cstr.getPointer(nativeHeap)

    glShaderSource(shader, 1, source.cstr, null)
//    glCompileShader(shader)

//    var status: Int
//    glGetShaderiv(shader, GL_COMPILE_STATUS, cValuesOf(status))
//    if status == gl.FALSE {
//        var logLength int32
//        gl.GetShaderiv(shader, gl.INFO_LOG_LENGTH, &logLength)
//
//        log := strings.Repeat("\x00", int(logLength+1))
//        gl.GetShaderInfoLog(shader, logLength, nil, gl.Str(log))
//
//        EoE("Failed to Compile Source ", fmt.Errorf("failed to compile %v: %v", source, log))
//    }

    return shader
}