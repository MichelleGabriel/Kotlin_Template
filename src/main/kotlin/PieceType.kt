package org.example.chess

enum class PieceType(val char: Char) {
    KING('K'),
    PAWN('P'),
    KNIGHT('N'),
    ROOK('R');

    companion object {
        fun of(char: Char) = entries.first { it.char == char }
    }
}