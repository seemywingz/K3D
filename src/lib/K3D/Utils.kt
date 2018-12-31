package K3D

import platform.posix.*
import kotlinx.cinterop.*
import kotlin.system.exitProcess

fun Boolean.toInt() = if (this) 1 else 0
fun Int.toBoolean() = if (this == 0) true else false

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

val K3D_SHAPE_TRIANGLE = floatArrayOf(
    -1f, -1f, 0f, 1f, 0f, 0f, 0f, 1f, 0f, 0f, 0f,
    0f, 1f, 0f, 0f, 0f, 0f, 0f, 1f, 0f, 0f, 0f,
    1f, -1f, 0f, 1f, 1f, 0f, 0f, 1f, 0f, 0f, 0f
)