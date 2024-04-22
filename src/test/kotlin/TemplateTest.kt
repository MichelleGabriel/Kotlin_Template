import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class TemplateTest {
    @Test
    fun testFixed() {
        assertEquals(5, getCount("abracadabra"))
        assertEquals(1, getCount("test"))
        assertEquals(3, getCount("example"))
    }
}