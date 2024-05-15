import Stat.ATTACK
import Stat.HEALTH
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class EquipmentTest {

    @Test
    fun `has default value for attack`() {
        //Given
        val equipment = anEquipment()

        //When
        val result = equipment.valueFor(ATTACK)

        //Then
        assertEquals(2, result)
    }

    @Test
    fun `is increasing attack value after leveling up`() {
        //Given
        val equipment = anEquipment()
        equipment.levelUp()

        //When
        val result = equipment.valueFor(ATTACK)

        //Then
        assertEquals(6, result)
    }

    @Test
    fun `is not increasing attack value when max level for common is reached`() {
        //Given
        val equipment = anEquipment(Rarity.COMMON)
        equipment.levelUp()
        equipment.levelUp()
        equipment.levelUp()

        //When
        val result = equipment.valueFor(ATTACK)

        //Then
        assertEquals(10, result)
    }

    @Test
    fun `is not increasing attack value when max level for rare is reached`() {
        //Given
        val equipment = anEquipment(Rarity.RARE)
        equipment.levelUp()
        equipment.levelUp()
        equipment.levelUp()
        equipment.levelUp()

        //When
        val result = equipment.valueFor(ATTACK)

        //Then
        assertEquals(14, result)
    }

    @Test
    fun `is not increasing attack value when max level for epic is reached`() {
        //Given
        val equipment = anEquipment(Rarity.EPIC)
        equipment.levelUp()
        equipment.levelUp()
        equipment.levelUp()
        equipment.levelUp()
        equipment.levelUp()

        //When
        val result = equipment.valueFor(ATTACK)

        //Then
        assertEquals(18, result)
    }

    @Test
    fun `is not increasing attack value when max level for legendary is reached`() {
        //Given
        val equipment = anEquipment(Rarity.LEGENDARY)
        equipment.levelUp()
        equipment.levelUp()
        equipment.levelUp()
        equipment.levelUp()
        equipment.levelUp()
        equipment.levelUp()

        //When
        val result = equipment.valueFor(ATTACK)

        //Then
        assertEquals(22, result)
    }

    @Test
    fun `has default value for health`() {
        //Given
        val equipment = anEquipment()

        //When
        val result = equipment.valueFor(HEALTH)

        //Then
        assertEquals(0, result)
    }

    @Test
    fun `has default value for attackSpeed`() {
        //Given
        val equipment = anEquipment()

        //When
        val result = equipment.valueFor(Stat.ATTACK_SPEED)

        //Then
        assertEquals(0, result)
    }

    @Test
    fun `has default value for recovery`() {
        //Given
        val equipment = anEquipment()

        //When
        val result = equipment.valueFor(Stat.RECOVERY)

        //Then
        assertEquals(0, result)
    }

    private fun anEquipment(rarity: Rarity = Rarity.RARE) = Equipment(rarity)

}