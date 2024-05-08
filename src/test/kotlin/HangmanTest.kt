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
    fun `remembers guessed matched letters`() {
        //Given
        val hangman = Hangman("test")
        hangman.guess('e')

        //When
        val result = hangman.guess('s')

        //Then
        assertEquals("_ e s _", result)
    }

    @Test
    fun `remembers guessed unmatched letters`() {
        //Given
        val hangman = Hangman("test")
        hangman.guess('l')

        //When
        val result = hangman.guess('u')

        //Then
        assertEquals("_ _ _ _ # lu", result)
    }

    @Test
    fun `joins matched and unmatched letters`() {
        //Given
        val hangman = Hangman("test")
        hangman.guess('l')

        //When
        hangman.guess('e')
        hangman.guess('s')
        val result = hangman.guess('u')

        //Then
        assertEquals("_ e s _ # lu", result)
    }

    @Test
    fun `guess duplicate letter`() {
        //Given
        val hangman = Hangman("test")

        //When
        val result = hangman.guess('t')

        //then
        assertEquals("t _ _ t", result)
    }
}