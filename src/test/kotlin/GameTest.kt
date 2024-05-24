package chess


import org.example.chess.Game
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class GameTest {
    private fun blankBoard() = arrayOf(
        arrayOf(' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '),
        arrayOf(' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '),
        arrayOf(' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '),
        arrayOf(' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '),
        arrayOf(' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '),
        arrayOf(' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '),
        arrayOf(' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '),
        arrayOf(' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '),
    )

    @Test
    fun `returns false if only king is on field`() {
        //Given
        val board = blankBoard()
        board[7][3] = 'K'
        val game = Game(board)

        //When
        val result = game.isCheck()

        //Then
        assertFalse(result)
    }

    @Test
    fun `returns true if king is check`() {
        //Given
        val board = blankBoard()
        board[7][3] = 'K'
        board[6][2] = 'P'
        val game = Game(board)

        //When
        val result = game.isCheck()

        //Then
        assertTrue(result)
    }

    @Test
    fun `returns true if king is check by one of two pawns`() {
        //Given
        val board = blankBoard()
        board[7][3] = 'K'
        board[6][2] = 'P'
        board[6][1] = 'P'
        val game = Game(board)

        //When
        val result = game.isCheck()

        //Then
        assertTrue(result)
    }

    @Test
    fun `returns true if king is check by one of two horse`() {
        //Given
        val board = blankBoard()
        board[7][3] = 'K'
        board[5][2] = 'N'
        board[6][1] = 'N'
        val game = Game(board)

        //When
        val result = game.isCheck()

        //Then
        assertTrue(result)
    }

    @Test
    fun `returns false if king is not check by one of two horse`() {
        //Given
        val board = blankBoard()
        board[7][3] = 'K'
        board[6][2] = 'N'
        board[1][1] = 'N'
        val game = Game(board)

        //When
        val result = game.isCheck()

        //Then
        assertFalse(result)
    }

    @Test
    fun `returns true if king is checked by rook `() {
        //Given
        val board = blankBoard()
        board[7][3] = 'K'
        board[7][7] = 'R'
        val game = Game(board)

        //When
        val result = game.isCheck()

        //Then
        assertTrue(result)
    }

    @Test
    fun `returns false if king blocked `() {
        //Given
        val board = blankBoard()
        board[7][3] = 'K'
        board[7][7] = 'R'
        board[7][4] = 'N'
        val game = Game(board)

        //When
        val result = game.isCheck()

        //Then
        assertFalse(result)
    }

}