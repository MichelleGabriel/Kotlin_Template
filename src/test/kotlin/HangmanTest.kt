import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class HangmanTest {

    @Test
    fun `guesses letter in word`() {
        //Given
        val hangman = Hangman("test")

        //When
        val result = hangman.guess('e')

        //Then
        assertEquals("_ e _ _", result)
    }

    @Test
    fun `guesses letter not in word`() {
        //Given
        val hangman = Hangman("test")

        //When
        val result = hangman.guess('l')

        //Then
        assertEquals("_ _ _ _ # l", result)
    }

    @Test
    fun `remembers guessed letters`() {
        //Given
        val hangman = Hangman("test")

        //When
        hangman.guess('e')
        hangman.guess('s')
        hangman.guess('l')
        val result = hangman.guess('u')

        //Then
        assertEquals("_ e s _ # lu", result)
    }
}