import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SetTest {

    @Test
    fun `is empty`() {
        //Given
        val set = Set()

        //When

        //Then
        assertTrue(set.isEmpty())

    }

    @Test
    fun `is not empty after adding a value`() {
        //Given
        val set = Set()

        //When
        set.add(1)

        //Then
        assertFalse(set.isEmpty())
    }

    @Test
    fun `is aware of content`() {
        //Given
        val set = Set()

        //When
        set.add(1)
        set.add(3)

        //Then
        assertEquals(2, set.count())

    }

    @Test
    fun `is containing specific number`() {
        //Given
        val set = Set()

        //When
        set.add(3)

        //Then
        assertTrue(set.contains(3))
        assertFalse(set.contains(1))

    }

    @Test
    fun `is distinct`() {
        //Given
        val set = Set()

        //When
        set.add(1)

        //Then
        assertEquals(1, set.count())
    }

    @Test
    fun `is removing a value`() {
        //Given
        val set = Set()
        set.add(3)
        set.add(1)

        //When
        set.remove(3)

        //Then
        assertFalse(set.contains(3))
        assertTrue(set.contains(1))
    }

    @Test
    fun `is removing2 a value`() {
        //Given
        val set = Set()
        set.add(3)
        set.add(1)

        //When
        set.remove2(3)

        //Then
        assertFalse(set.contains(3))
        assertTrue(set.contains(1))
    }

    @Test
    fun `count is decreasing when removing a value`() {
        //Given
        val set = Set()
        set.add(1)
        set.add(3)

        //When
        set.remove(3)

        //Then
        assertEquals(1, set.count())
    }
}



