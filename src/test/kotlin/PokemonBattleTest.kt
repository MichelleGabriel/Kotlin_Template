import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PokemonBattleTest {
    @Test
    fun `calculates damage with effectivness multiplier`() {
        //Given
        val pokemonBattle = PokemonBattle()

        //When
        val damage = pokemonBattle.calculate(
            ownType = Type.FIRE,
            enemyType = Type.ELECTRO,
            ownAttack = 20,
            enemyDefense = 5
        )

        //Then
        assertEquals(200, damage)

    }
}