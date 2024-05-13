import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class PokemonBattleTest {
    @Test
    fun `calculates damage with neutral effectivness`() {
        //Given
        val pokemonBattle = PokemonBattle()

        //When
        val damage = pokemonBattle.calculate("Fire", "Electro", 20, 10)

        //Then
        assertEquals(100, damage)

    }
}