import dna.makeComplement
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class TestExample {
    @Test
    fun test01() {
        assertEquals("TTTT", makeComplement("AAAA"));
    }
    @Test
    fun test02() {
        assertEquals("TAACG", makeComplement("ATTGC"));
    }

}