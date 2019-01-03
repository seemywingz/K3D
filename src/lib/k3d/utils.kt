package k3d

import cglm.*
import platform.posix.*
import kotlinx.cinterop.*
import kotlin.system.exitProcess

fun Boolean.toInt() = if (this) 1 else 0
fun Int.toBoolean() = if (this == 1) true else false

fun FloatArray.setFromMat4(mat: mat4) {
        for (i in this.indices) {
        this[i] = mat[i]
    }
}

fun mat4FromFloatArray(array: FloatArray): mat4 {
    memScoped {
        val matrix = nativeHeap.allocArray<FloatVar>(array.size)
        for (i in array.indices) {
            matrix[i] = array[i]
        }
        return matrix
    }
}

fun readFileAsString(fileName: String): String {

    var data = ""
    val file = fopen(fileName, "r")
    if (file == null) {
        perror("cannot open input file ${fileName}")
        return ""
    }

    try {
        memScoped {
            val bufferLength = 64 * 1024
            val buffer = allocArray<ByteVar>(bufferLength)
            for (i in 1..bufferLength) {
                val nextLine = fgets(buffer, bufferLength, file)?.toKString()
                if (nextLine == null || nextLine.isEmpty()) break
                data += nextLine
            }
        }
    } finally {
        fclose(file)
    }

    return data
}