package K3D



fun Boolean.toInt() = if (this) 1 else 0
fun Int.toBoolean() = if (this == 0) true else false


//fun k3dGetResourceAsString(resource: String): String =
//    try {
//        object {}.javaClass.getResource(resource)
//            .readText(Charsets.UTF_8)
//    } catch (all: Exception) {
//        throw RuntimeException("Failed to load resource=$resource!", all)
//    }

//fun readFileDirectlyAsText(fileName: String): String
//        = File(fileName).readText(Charsets.UTF_8)
