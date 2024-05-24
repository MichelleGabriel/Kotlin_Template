import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class StatTest {
    @Test
    fun `has baseValue`() {
        //Given

        //When

        //Then
        assertEquals(4, Stat.ATTACK.increment)
        assertEquals(5, Stat.HEALTH.increment)
        assertEquals(3, Stat.ATTACK_SPEED.increment)
        assertEquals(2, Stat.RECOVERY.increment)
    }

    @Test
    fun `increment value at specific level for attack`() {
        //Given

        //When

        //Then
        assertEquals(0, Stat.ATTACK.someMethodNameWeAreGoingToDecideLater(level = 0))
        assertEquals(4, Stat.ATTACK.someMethodNameWeAreGoingToDecideLater(level = 1))
        assertEquals(0, Stat.ATTACK.someMethodNameWeAreGoingToDecideLater(level = 2))
        assertEquals(0, Stat.ATTACK.someMethodNameWeAreGoingToDecideLater(level = 3))
        assertEquals(0, Stat.ATTACK.someMethodNameWeAreGoingToDecideLater(level = 4))
        assertEquals(4, Stat.ATTACK.someMethodNameWeAreGoingToDecideLater(level = 5))
    }

    @Test
    fun `increment value at specific level for Health`() {
        //Given

        //When

        //Then
        assertEquals(0, Stat.HEALTH.someMethodNameWeAreGoingToDecideLater(level = 0))
        assertEquals(0, Stat.HEALTH.someMethodNameWeAreGoingToDecideLater(level = 1))
        assertEquals(5, Stat.HEALTH.someMethodNameWeAreGoingToDecideLater(level = 2))
        assertEquals(0, Stat.HEALTH.someMethodNameWeAreGoingToDecideLater(level = 3))
        assertEquals(0, Stat.HEALTH.someMethodNameWeAreGoingToDecideLater(level = 4))
        assertEquals(0, Stat.HEALTH.someMethodNameWeAreGoingToDecideLater(level = 5))
    }
}
// ATTACK - variant a
// level | value
// 0     | 0
// 1     | 4
// 2     | 0
// 3     | 0
// 4     | 0
// 5     | 4

// ATTACK - variant b
// level | value
// 0     | 0
// 1     | 4
// 2     | 4
// 3     | 4
// 4     | 4
// 5     | 8


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