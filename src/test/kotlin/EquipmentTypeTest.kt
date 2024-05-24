import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class EquipmentTypeTest{
    @Test
    fun `has correct stats for weapon`() {
        // GIVEN
        val weapon = EquipmentType.WEAPON

        // WHEN

        // THEN
        assertEquals(2 + Stat.ATTACK.increment, weapon.valueAt(1, Stat.ATTACK))
        assertEquals(0, weapon.valueAt(1, Stat.HEALTH))
        assertEquals(0, weapon.valueAt(1, Stat.RECOVERY))
        assertEquals(0, weapon.valueAt(1, Stat.ATTACK_SPEED))
    }

    @Test
    fun `has correct stats for chest`() {
        // GIVEN
        val weapon = EquipmentType.CHEST

        // WHEN

        // THEN
        assertEquals(2 + Stat.HEALTH.increment, weapon.valueAt(1, Stat.HEALTH))
        assertEquals(0, weapon.valueAt(1, Stat.ATTACK))
        assertEquals(0, weapon.valueAt(1, Stat.RECOVERY))
        assertEquals(0, weapon.valueAt(1, Stat.ATTACK_SPEED))
    }

    @Test
    fun `has correct stats for gloves`() {
        // GIVEN
        val weapon = EquipmentType.GLOVES

        // WHEN

        // THEN
        assertEquals(2 + Stat.ATTACK_SPEED.increment, weapon.valueAt(1, Stat.ATTACK_SPEED))
        assertEquals(0, weapon.valueAt(1, Stat.ATTACK))
        assertEquals(0, weapon.valueAt(1, Stat.HEALTH))
        assertEquals(0, weapon.valueAt(1, Stat.RECOVERY))
    }

    @Test
    fun `has correct stats for head`() {
        // GIVEN
        val weapon = EquipmentType.HEAD

        // WHEN

        // THEN
        assertEquals(2 + Stat.RECOVERY.increment, weapon.valueAt(1, Stat.RECOVERY))
        assertEquals(0, weapon.valueAt(1, Stat.ATTACK))
        assertEquals(0, weapon.valueAt(1, Stat.HEALTH))
        assertEquals(0, weapon.valueAt(1, Stat.ATTACK_SPEED))
    }
}