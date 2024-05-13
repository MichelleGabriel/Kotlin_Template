import Type.*
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class TypeTest {

    @ParameterizedTest(name = "is super effective when {0} attacks {1}")
    @MethodSource("superEffectiveCases")
    fun `handles all super effective cases`(ownType: Type, enemyType: Type) {
        // GIVEN

        // WHEN
        val result = ownType.effectivenessMultiplier(enemyType)

        // THEN
        assertEquals(2.0, result)
    }

    @ParameterizedTest(name = "is not very effective when {0} attacks {1}")
    @MethodSource("notVeryEffectiveCases")
    fun `handles all not super effective cases`(ownType: Type, enemyType: Type) {
        // GIVEN

        // WHEN
        val result = ownType.effectivenessMultiplier(enemyType)

        // THEN
        assertEquals(0.5, result)
    }


    //Super effective
    @Test
    fun `multiplier for neutral effectivness`() {
        //Given

        //When

        //Then
        assertEquals(1.0, FIRE.effectivenessMultiplier(FIRE))
    }

    companion object {
        @JvmStatic
        fun superEffectiveCases(): List<Arguments> {
            return listOf(
                Arguments.of(FIRE, GRASS),
                Arguments.of(WATER, FIRE),
                Arguments.of(GRASS, ELECTRO),
                Arguments.of(ELECTRO, WATER),
            )
        }

        @JvmStatic
        fun notVeryEffectiveCases(): List<Arguments> {
            return listOf(
                Arguments.of(GRASS, FIRE),
                Arguments.of(FIRE, WATER),
                Arguments.of(ELECTRO, GRASS),
                Arguments.of(WATER, ELECTRO),
            )
        }
    }
}
