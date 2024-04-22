import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TestExample {
    @Test
    fun testFixed() {
        assertEquals(5, getCount("abracadabra"))
        assertEquals(1, getCount("test"))
        assertEquals(3, getCount("example"))
    }
}