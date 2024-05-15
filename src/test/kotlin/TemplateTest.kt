import EquipmentType.*
import Stat.*
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class EquipmentTest {

    @Test
    fun `is not increasing attack value when max level for common is reached`() {
        //Given
        val equipment = anEquipment(Rarity.COMMON, type = WEAPON)
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
        val equipment = anEquipment(Rarity.RARE, type = WEAPON)
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
        val equipment = anEquipment(Rarity.EPIC, type = WEAPON)
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
        val equipment = anEquipment(Rarity.LEGENDARY, type = WEAPON)

        //Needs to be refactored
        //equipment.levelUp(times = 6)

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
        val equipment = anEquipment(type = WEAPON)

        //When
        val result = equipment.valueFor(HEALTH)

        //Then
        assertEquals(0, result)
    }

    @Test
    fun `has default value for attackSpeed`() {
        //Given
        val equipment = anEquipment(type = HEAD)

        //When
        val result = equipment.valueFor(ATTACK_SPEED)

        //Then
        assertEquals(0, result)
    }

    @Test
    fun `has default value for recovery`() {
        //Given
        val equipment = anEquipment(type = GLOVES)

        //When
        val result = equipment.valueFor(RECOVERY)

        //Then
        assertEquals(0, result)
    }

    @Test
    fun `has increased health stat when equipment is chest`() {

        //Given
        val equipment = anEquipment(type = CHEST)

        //When
        val result = equipment.valueFor(HEALTH)

        //Then
        assertEquals(2, result)

    }

    private fun anEquipment(
        rarity: Rarity = Rarity.COMMON,
        type: EquipmentType = GLOVES
    ) = Equipment(rarity, type)


}