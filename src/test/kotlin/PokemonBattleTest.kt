import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class PokemonBattleTest {
    @Test
    fun `calculates damage with neutral effectivness`() {
        //Given
        val pokemonBattle = PokemonBattle()

        //When
        val damage = pokemonBattle.calculate(
            ownType = Type.FIRE,
            enemyType = Type.ELECTRO,
            ownAttack = 20,
            enemyDefense = 10
        )

        //Then
        assertEquals(100, damage)

    }

    @Test
    fun `calculates damage with effectiveness`() {
        //Given
        val pokemonBattle = PokemonBattle()

        //When
        val damage = pokemonBattle.calculate(
            ownType = Type.FIRE,
            enemyType = Type.GRASS,
            ownAttack = 20,
            enemyDefense = 10
        )

        //Then
        assertEquals(200, damage)
    }
}