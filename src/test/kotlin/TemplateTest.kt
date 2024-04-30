import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("Example tests")
class ZonkTests {

    @Test
    fun `straight dice roll returns 1000`() {
        assertEquals(1000, getScore(intArrayOf(6,3,1,2,5,4)))
        assertEquals(1000, getScore(intArrayOf(1,2,3,4,5,6)))
    }


    @Test
    fun `three pairs of any dice`() {
        assertEquals(750, getScore(intArrayOf(2,2,4,4,1,1)))
        assertEquals(0, getScore(intArrayOf(3,2)))
        assertEquals(1000, getScore(intArrayOf(1,2,3,4,5,6)))
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