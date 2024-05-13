import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TypeTest {

    @Test
    fun `multiplier for - WATER against FIRE`() {
        //Given
        val ownType = Type.WATER
        val enemyType = Type.FIRE

        //When
        val multiplier = ownType.calculateEffectivenessMultiplier(enemyType)

        //Then
        assertEquals(2, multiplier)
    }

}