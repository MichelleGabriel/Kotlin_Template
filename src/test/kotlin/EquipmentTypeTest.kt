import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class EquipmentTypeTest{
    @Test
    fun `has correct stats for weapon`() {
        // GIVEN
        val weapon = EquipmentType.WEAPON

        // WHEN

        // THEN
        assertEquals(2 + Stat.ATTACK.baseValue, weapon.valueAtLevel(Stat.ATTACK, 1))
        assertEquals(0, weapon.valueAtLevel(Stat.HEALTH, 1))
        assertEquals(0, weapon.valueAtLevel(Stat.RECOVERY, 1))
        assertEquals(0, weapon.valueAtLevel(Stat.ATTACK_SPEED, 1))
    }

    @Test
    fun `has correct stats for chest`() {
        // GIVEN
        val weapon = EquipmentType.CHEST

        // WHEN

        // THEN
        assertEquals(2 + Stat.HEALTH.baseValue, weapon.valueAtLevel(Stat.HEALTH, 1))
        assertEquals(0, weapon.valueAtLevel(Stat.ATTACK, 1))
        assertEquals(0, weapon.valueAtLevel(Stat.RECOVERY, 1))
        assertEquals(0, weapon.valueAtLevel(Stat.ATTACK_SPEED, 1))
    }

    @Test
    fun `has correct stats for gloves`() {
        // GIVEN
        val weapon = EquipmentType.GLOVES

        // WHEN

        // THEN
        assertEquals(2 + Stat.ATTACK_SPEED.baseValue, weapon.valueAtLevel(Stat.ATTACK_SPEED, 1))
        assertEquals(0, weapon.valueAtLevel(Stat.ATTACK, 1))
        assertEquals(0, weapon.valueAtLevel(Stat.HEALTH, 1))
        assertEquals(0, weapon.valueAtLevel(Stat.RECOVERY, 1))
    }

    @Test
    fun `has correct stats for head`() {
        // GIVEN
        val weapon = EquipmentType.HEAD

        // WHEN

        // THEN
        assertEquals(2 + Stat.RECOVERY.baseValue, weapon.valueAtLevel(Stat.RECOVERY, 1))
        assertEquals(0, weapon.valueAtLevel(Stat.ATTACK, 1))
        assertEquals(0, weapon.valueAtLevel(Stat.HEALTH, 1))
        assertEquals(0, weapon.valueAtLevel(Stat.ATTACK_SPEED, 1))
    }
}