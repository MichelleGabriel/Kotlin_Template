import Stat.Attack
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class EquipmentTest {

    @Test
    fun `has default value for attack`() {
        //Given
        val equipment = Equipment()

        //When
        val result = equipment.valueFor(Attack)

        //Then
        assertEquals(1, result)
    }

    @Test
    fun `is increasing attack value after leveling up`() {
        //Given
        val equipment = Equipment()
        equipment.levelUp()

        //When
        val result = equipment.valueFor(Attack)

        //Then
        assertEquals(2, result)
    }

    @Test
    fun `is not increasing attack value after level max`() {
        //Given
        val equipment = Equipment()
        equipment.levelUp()
        equipment.levelUp()
        equipment.levelUp()
        equipment.levelUp()

        //When
        val result = equipment.valueFor(Attack)

        //Then
        assertEquals(4, result)
    }

}