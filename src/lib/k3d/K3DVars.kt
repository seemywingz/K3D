package k3d

val k3dWindowHints = mutableListOf<K3DWindowHint>()

val K3DTestTriangle = floatArrayOf(
    0.0f, 0.5f, 0.0f,
    0.5f, -0.5f, 0.0f,
    -0.5f, -0.5f, 0.0f
)

val K3DTriangle = floatArrayOf(
    -1f, -1f, 0f, 1f, 0f, 0f, 0f, 1f, 0f, 0f, 0f,
    0f, 1f, 0f, 0f, 0f, 0f, 0f, 1f, 0f, 0f, 0f,
    1f, -1f, 0f, 1f, 1f, 0f, 0f, 1f, 0f, 0f, 0f
)

val K3DPlane = floatArrayOf(
    -0.5f, -0.5f, 0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0f, 0f, 0f,
    0.5f, -0.5f, 0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0f, 0f, 0f,
    -0.5f, 0.5f, 0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0f, 0f, 0f,
    -0.5f, 0.5f, 0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0f, 0f, 0f,
    0.5f, 0.5f, 0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0f, 0f, 0f,
    0.5f, -0.5f, 0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0f, 0f, 0f
)

val K3DCube = floatArrayOf(
    //  X, Y, Z,  U, V,  [3]normal [3]tangent
    // Bottom
    -1.0f, -1.0f, -1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0f, 0f, 0f,
    1.0f, -1.0f, -1.0f, 1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0f, 0f, 0f,
    -1.0f, -1.0f, 1.0f, 0.0f, 1.0f, 0.0f, -1.0f, 0.0f, 0f, 0f, 0f,
    1.0f, -1.0f, -1.0f, 1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0f, 0f, 0f,
    1.0f, -1.0f, 1.0f, 1.0f, 1.0f, 0.0f, -1.0f, 0.0f, 0f, 0f, 0f,
    -1.0f, -1.0f, 1.0f, 0.0f, 1.0f, 0.0f, -1.0f, 0.0f, 0f, 0f, 0f,

    // Top
    -1.0f, 1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0f, 0f, 0f,
    -1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0f, 0f, 0f,
    1.0f, 1.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0f, 0f, 0f,
    1.0f, 1.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0f, 0f, 0f,
    -1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0f, 0f, 0f,
    1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0f, 0f, 0f,

    // Front
    -1.0f, -1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0f, 0f, 0f,
    1.0f, -1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0f, 0f, 0f,
    -1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0f, 0f, 0f,
    1.0f, -1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0f, 0f, 0f,
    1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0f, 0f, 0f,
    -1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0f, 0f, 0f,

    // Back
    -1.0f, -1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0f, 0f, 0f,
    -1.0f, 1.0f, -1.0f, 0.0f, 1.0f, 0.0f, 0.0f, -1.0f, 0f, 0f, 0f,
    1.0f, -1.0f, -1.0f, 1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0f, 0f, 0f,
    1.0f, -1.0f, -1.0f, 1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0f, 0f, 0f,
    -1.0f, 1.0f, -1.0f, 0.0f, 1.0f, 0.0f, 0.0f, -1.0f, 0f, 0f, 0f,
    1.0f, 1.0f, -1.0f, 1.0f, 1.0f, 0.0f, 0.0f, -1.0f, 0f, 0f, 0f,

    // Left
    -1.0f, -1.0f, 1.0f, 0.0f, 1.0f, -1.0f, 0.0f, 0.0f, 0f, 0f, 0f,
    -1.0f, 1.0f, -1.0f, 1.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0f, 0f, 0f,
    -1.0f, -1.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0f, 0f, 0f,
    -1.0f, -1.0f, 1.0f, 0.0f, 1.0f, -1.0f, 0.0f, 0.0f, 0f, 0f, 0f,
    -1.0f, 1.0f, 1.0f, 1.0f, 1.0f, -1.0f, 0.0f, 0.0f, 0f, 0f, 0f,
    -1.0f, 1.0f, -1.0f, 1.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0f, 0f, 0f,

    // Right
    1.0f, -1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0f, 0f, 0f,
    1.0f, -1.0f, -1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0f, 0f, 0f,
    1.0f, 1.0f, -1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0f, 0f, 0f,
    1.0f, -1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0f, 0f, 0f,
    1.0f, 1.0f, -1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0f, 0f, 0f,
    1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0f, 0f, 0f
)