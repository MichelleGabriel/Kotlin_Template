package org.example.chess

import org.example.chess.PieceType.*
import kotlin.math.abs

class ChessPiece(
    val coord: Coordinate,
    val type: PieceType
) {




    data class Coordinate(val row: Int, val col: Int)
}