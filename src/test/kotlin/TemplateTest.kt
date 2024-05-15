import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class EquipmentTest {

    @Test
    fun `is created with default value for attack`() {
        //Given
        val equipment = Equipment()
        //When
        val result = equipment.valueFor(Stat.Attack)
        //Then
        assertEquals(1, result)
    }
}