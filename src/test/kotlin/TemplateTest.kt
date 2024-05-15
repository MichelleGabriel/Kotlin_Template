import Stat.*
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
        assertEquals(2, result)
    }

    @Test
    fun `is increasing attack value after leveling up`() {
        //Given
        val equipment = Equipment()
        equipment.levelUp()

        //When
        val result = equipment.valueFor(Attack)

        //Then
        assertEquals(6, result)
    }

    @Test
    fun `is not increasing attack value when max level is reached`() {
        //Given
        val equipment = Equipment()
        equipment.levelUp()
        equipment.levelUp()
        equipment.levelUp()
        equipment.levelUp()

        //When
        val result = equipment.valueFor(Attack)

        //Then
        assertEquals(14, result)
    }

    @Test
    fun `has default value for health`() {
        //Given
        val equipment = Equipment()

        //When
        val result = equipment.valueFor(Health)

        //Then
        assertEquals(0, result)
    }

}