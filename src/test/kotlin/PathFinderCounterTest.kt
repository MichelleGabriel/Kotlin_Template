import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PathFinderCounterTest {

    @Test
    fun `returns width when no field is blocked`() {
        //GIVEN

        //WHEN
        val result = getNumberOfReachableFields(
            grid = arrayOf(
                arrayOf(1, 1, 1, 1),
                arrayOf(1, 1, 1, 1),
                arrayOf(1, 1, 1, 1)
            ),
            startRow = 0,
            startColumn = 0
        )

        //THEN
        assertEquals(4, result)
    }

    @Test
    fun `returns 0 if one row is blocked below player`() {
        //GIVEN

        //WHEN
        val result = getNumberOfReachableFields(
            grid = arrayOf(
                arrayOf(1, 1, 1, 1),
                arrayOf(0, 0, 0, 0),
                arrayOf(1, 1, 1, 1)
            ),
            startRow = 0,
            startColumn = 0
        )

        //THEN
        assertEquals(0, result)
    }

    @Test
    fun `returns 0 if no path is available`() {
        //GIVEN

        //WHEN
        val result = getNumberOfReachableFields(
            grid = arrayOf(
                arrayOf(1, 0, 1, 1),
                arrayOf(0, 0, 1, 1),
                arrayOf(1, 1, 0, 0)
            ),
            startRow = 0,
            startColumn = 3
        )

        //THEN
        assertEquals(0, result)
    }

    @Test
    fun `returns width when path exists and no field is blocked in last row`() {
        //GIVEN

        //WHEN
        val result = getNumberOfReachableFields(
            grid = arrayOf(
                arrayOf(1, 1, 1),
                arrayOf(1, 1, 1),
                arrayOf(1, 0, 0),
                arrayOf(1, 1, 1),
                arrayOf(1, 1, 1)
            ),
            startRow = 0,
            startColumn = 1
        )

        //THEN
        assertEquals(3, result)
    }

    @Test
    fun `returns zero if player is blocked`() {
        //GIVEN

        //WHEN
        val result = getNumberOfReachableFields(
            grid = arrayOf(
                arrayOf(0, 0, 0, 1, 1, 1),
                arrayOf(0, 1, 0, 1, 1, 1),
                arrayOf(0, 0, 0, 1, 1, 1),
                arrayOf(1, 1, 1, 1, 1, 1),
                arrayOf(1, 1, 1, 1, 1, 1)
            ),
            startRow = 1,
            startColumn = 1
        )

        //THEN
        assertEquals(0, result)
    }

    @Test
    fun `returns correct amount if some blocks in last row are blocked`() {
        //GIVEN

        //WHEN
        val result = getNumberOfReachableFields(
            grid = arrayOf(
                arrayOf(1, 1, 1, 1, 1, 1),
                arrayOf(1, 1, 1, 1, 1, 1),
                arrayOf(1, 0, 0, 0, 0, 0),
                arrayOf(1, 1, 1, 1, 1, 1),
                arrayOf(1, 1, 0, 0, 1, 1)
            ),
            startRow = 1,
            startColumn = 1
        )

        //THEN
        assertEquals(4, result)
    }

    @Test
    fun `returns correct amount when player can move upwards`() {
        //GIVEN

        //WHEN
        val result = getNumberOfReachableFields(
            grid = arrayOf(
                arrayOf(1, 1, 1, 0),
                arrayOf(1, 0, 1, 0),
                arrayOf(0, 0, 1, 0),
                arrayOf(1, 1, 1, 1),
                ),
            startRow = 1,
            startColumn = 0
        )

        //THEN
        assertEquals(4, result)
    }

    @Test
    fun `snake stuff`() {
        //GIVEN

        //WHEN
        val result = getNumberOfReachableFields(
            grid = arrayOf(
                arrayOf(1, 1, 1, 1, 1, 1, 1, 1),
                arrayOf(0, 0, 0, 0, 0, 0, 0, 1),
                arrayOf(1, 1, 1, 1, 1, 1, 1, 1),
                arrayOf(1, 0, 0, 0, 0, 0, 0, 0),
                arrayOf(1, 1, 1, 1, 1, 1, 1, 1),
                arrayOf(0, 0, 0, 0, 0, 0, 0, 1),
                arrayOf(1, 1, 1, 1, 1, 1, 1, 1),
                arrayOf(1, 0, 0, 0, 0, 0, 0, 0),
                arrayOf(1, 1, 1, 1, 1, 1, 1, 1)
            ),
            startRow = 1,
            startColumn = 1
        )

        //THEN
        assertEquals(8, result)
    }

}