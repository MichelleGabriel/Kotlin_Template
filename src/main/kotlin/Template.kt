package dna

fun makeComplement(dna: String): String {

    return dna.map {
        when (it) {
            'T' -> 'A'
            'A' -> 'T'
            'G' -> 'C'
            'C' -> 'G'
            else -> {it}
        }
    }
        .joinToString("")

}