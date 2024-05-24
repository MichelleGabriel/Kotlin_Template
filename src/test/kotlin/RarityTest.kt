import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class RarityTest {

    @Test
    fun `has correct maxLevel`() {
        //Given

        //When

        //Then
        assertEquals(2, Rarity.COMMON.maxLevel)
        assertEquals(3, Rarity.RARE.maxLevel)
        assertEquals(4, Rarity.EPIC.maxLevel)
        assertEquals(5, Rarity.LEGENDARY.maxLevel)

    }
}