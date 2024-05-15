import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class EquipmentTypeTest{
    @Test
    fun `has correct stats for weapon`() {
        // GIVEN
        val weapon = EquipmentType.WEAPON

        // WHEN

        // THEN
        assertEquals(6, weapon.valueAtLevel(Stat.ATTACK, 1))
        assertEquals(0, weapon.valueAtLevel(Stat.HEALTH, 1))
        assertEquals(0, weapon.valueAtLevel(Stat.RECOVERY, 1))
        assertEquals(0, weapon.valueAtLevel(Stat.ATTACK_SPEED, 1))

    }
}