@file:OptIn(ExperimentalStdlibApi::class)


@OptIn(ExperimentalStdlibApi::class)
fun rgb(r: Int, g: Int, b: Int): String {

    var firstHex = r.coerceIn(0,255).toHexString(format = HexFormat.UpperCase).takeLast(2)
    var secondHex = g.coerceIn(0,255).toHexString(format = HexFormat.UpperCase).takeLast(2)
    var thirdHex = b.coerceIn(0,255).toHexString(format = HexFormat.UpperCase).takeLast(2)

    println()

    return toHex(r) + toHex(g) + toHex(b)
    //return "${toHex(r)}${toHex(g)}${toHex(b)}"
}

@OptIn(ExperimentalStdlibApi::class)
private fun toHex(color: Int) = when {
    color < 0 -> "00"
    color > 255 -> "FF"
    else -> color.toHexString(format = HexFormat.UpperCase).takeLast(2)
}

//Option mit .coerceIn direkt in der Methode
@OptIn(ExperimentalStdlibApi::class)
private fun Int.toHexColor() = this
    .coerceIn(0,255)
    .toHexString(format = HexFormat.UpperCase)
    .takeLast(2)
