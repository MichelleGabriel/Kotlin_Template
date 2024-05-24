import EquipmentType.GLOVES
import EquipmentType.HEAD
import Rarity.COMMON
import Rarity.RARE
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class EquipmentTest {

    @Test
    fun `has value for specific Stat with specific Rarity`() {
        //Given
        val equipment = anEquipment(
            rarity = RARE,
            type = GLOVES
        )

        //When
        equipment.levelUp(times = 4)
        val result = equipment.valueFor(Stat.ATTACK_SPEED)

        //Then
        assertEquals(GLOVES.valueAt(level = 3, stat = Stat.ATTACK_SPEED), result)
    }
}

private fun anEquipment(
    rarity: Rarity = COMMON,
    type: EquipmentType = HEAD
) = Equipment(rarity, type)

private fun Equipment.levelUp(times: Int) {
    for (i in 0..<times) {
        levelUp()
    }
}
