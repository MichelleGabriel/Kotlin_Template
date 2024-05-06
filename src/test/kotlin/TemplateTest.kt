import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("Example tests")
class ZonkTests {

    @Test
    fun `straight dice roll returns 1000 2`() {
        // GIVEN
        val straightDiceRole = intArrayOf(3,2,1,4,5,6)

        // WHEN
        val score = getScore(straightDiceRole)

        // THEN
        assertEquals(1000, score)
    }

    @Test
    fun `straight dice roll returns 1000`() {
        assertEquals(1000, getScore(intArrayOf(6,3,1,2,5,4)))
        assertEquals(1000, getScore(intArrayOf(1,2,3,4,5,6)))
    }

    @Test
    fun `three pairs of any dice`() {
        // GIVEN
        val threeDifferentPairs = intArrayOf(3,3,1,1,5,5)

        // WHEN
        val score = getScore(threeDifferentPairs)

        // THEN
        assertEquals(750, score)
    }

    @Test
    fun `three of 1`() {
        assertEquals(1000, getScore(intArrayOf(1,4,1,1)))
    }

    @Test
    fun `three of 2`() {
        assertEquals(200, getScore(intArrayOf(2,4,2,2)))
        assertEquals(200, getScore(intArrayOf(2,4,2,2,4,6)))
    }

    @Test
    fun `three same dice`() {
        assertEquals(300, getScore(intArrayOf(3,4,3,3)))
        assertEquals(400, getScore(intArrayOf(4,4,3,3,4,6)))
    }

    @Test
    @DisplayName("Single die")
    fun test1() {
        doTest(intArrayOf(1), 100)
        doTest(intArrayOf(2), 0)
        doTest(intArrayOf(3), 0)
        doTest(intArrayOf(4), 0)
        doTest(intArrayOf(5), 50)
        doTest(intArrayOf(6), 0)
    }
    @Test
    @DisplayName("Multiple dice")
    fun test2() {
        doTest(intArrayOf(1,1), 200)
        doTest(intArrayOf(1,1,1), 1000)
        doTest(intArrayOf(1,2,3,4,5,6), 1000)
        doTest(intArrayOf(2,2,3,3,6,6), 750)
        doTest(intArrayOf(3,2,6,4,4,6), 0)
    }
    private fun doTest(dice: IntArray, expected: Int) {
        assertEquals(expected, getScore(dice), "(" + dice.joinToString() + ")")
    }
}