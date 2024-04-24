import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MissingLetterTests {

    @Test
    fun exampleTests() {
        assertEquals('e', findMissingLetter(charArrayOf('a', 'b', 'c', 'd', 'f')))
        assertEquals('P', findMissingLetter(charArrayOf('O', 'Q', 'R', 'S')))
    }
}