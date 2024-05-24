package org.example.chess

import org.example.chess.ChessPiece.Coordinate
import org.example.chess.PieceType.*
import kotlin.math.abs

class Game(
    private val board: Array<Array<Char>>
) {
    fun isCheck(): Boolean {
        val king = piecesOnBoard(KING).first()
        val opponents = PieceType.entries
            .map { piecesOnBoard(it) }
            .flatten()
            .filter { it.type != KING }
        return opponents.any { it.checks(king) }
    }

    private fun ChessPiece.checks(other: ChessPiece, board: Array<Array<Char>> = emptyArray()) = when (this.type) {
        PAWN -> pawnChecks(other)
        KNIGHT -> knightChecks(other)
        ROOK -> rookChecks(other)
        else -> false
    }

    private fun ChessPiece.pawnChecks(other: ChessPiece) =
        this.coord.row == other.coord.row - 1
                && abs(this.coord.col - other.coord.col) == 1

    private fun ChessPiece.knightChecks(other: ChessPiece): Boolean =
        (abs(this.coord.row - other.coord.row) == 2 && abs(this.coord.col - other.coord.col) == 1)
                || (abs(this.coord.row - other.coord.row) == 1 && abs(this.coord.col - other.coord.col) == 2)

    private fun ChessPiece.rookChecks(other: ChessPiece) =
        (this.coord.row == other.coord.row || this.coord.col == other.coord.col)

    private fun ChessPiece.hasClearViewOn(other: ChessPiece): Boolean {
        val lineToCheck : List<Char>

        if (this.coord.col==other.coord.col) {
            lineToCheck = board.col(coord.col)

        } else if (this.coord.row==other.coord.row) {
            lineToCheck = board.row(coord.row)
        } else {lineToCheck= emptyList()}

        TODO()
    }

    private fun piecesOnBoard(pieceType: PieceType): List<ChessPiece> = board
        .indices
        .map { rowIndex ->
            board[rowIndex].positionsOf(pieceType)
                .map { columnIndex ->
                    ChessPiece(Coordinate(rowIndex, columnIndex), pieceType)
                }
        }
        .filter { it.isNotEmpty() }
        .flatten()

    private fun Array<Char>.positionsOf(pieceType: PieceType) = this
        .mapIndexed { index, field -> if (field == pieceType.char) index else -1 }
        .filter { it != -1 }

    private fun Array<Array<Char>>.col(index: Int) = this
        .indices
        .map { this[it][index] }

    private fun Array<Array<Char>>.row(index: Int) = this[index].toList()
}