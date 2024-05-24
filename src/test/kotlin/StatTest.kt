import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class StatTest {
    @Test
    fun `has baseValue`() {
        //Given

        //When

        //Then
        assertEquals(4, Stat.ATTACK.baseValue)
        assertEquals(5, Stat.HEALTH.baseValue)
        assertEquals(3, Stat.ATTACK_SPEED.baseValue)
        assertEquals(2, Stat.RECOVERY.baseValue)
    }
}
// weapon
// level | attackdmg• | health | AS | Rec
// level 0 | 2        | 0      | 0 | 0
// level 1 | 10        | 0      | 0 | 0
// level 2 | 14        | 5      | 0 | 0
// level 3 | 18        | 5      | 3 | 0
// level 4 | 22        | 5      | 3 | 2
// level 5 | 30        | 5      | 3 | 2

// Chest
// level | attackdmg | health* | AS | Rec
// level 0 | 0        | 2      | 0 | 0
// level 1 | 4        | 7      | 0 | 0
// level 2 | 4        | 17      | 0 | 0
// level 3 | 4        | 22      | 3 | 0
// level 4 | 4        | 27      | 3 | 2
// level 5 | 8        | 32      | 3 | 2