import Type.*
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TypeTest {

    //Super effective
    @Test
    fun `multiplier for - FIRE against GRASS`() {
        //Given

        //When

        //Then
        assertEquals(2.0, FIRE.effectivenessMultiplier(GRASS))
    }

    @Test
    fun `multiplier for - WATER against FIRE`() {
        //Then
        assertEquals(2.0, WATER.effectivenessMultiplier(FIRE))
    }

    @Test
    fun `multiplier for - GRASS against ELECTRO`() {
        //Then
        assertEquals(2.0, GRASS.effectivenessMultiplier(ELECTRO))
    }

    @Test
    fun `multiplier for - ELECTRO against WATER`() {
        //Then
        assertEquals(2.0, ELECTRO.effectivenessMultiplier(WATER))
    }

    //Not very effective
    @Test
    fun `multiplier for - GRASS against FIRE`() {
        //Then
        assertEquals(0.5, GRASS.effectivenessMultiplier(FIRE))
    }

    @Test
    fun `multiplier for - FIRE against WATER`() {
        //Then
        assertEquals(0.5, FIRE.effectivenessMultiplier(WATER))
    }

    @Test
    fun `multiplier for - ELECTRO against GRASS`() {
        //Then
        assertEquals(0.5, ELECTRO.effectivenessMultiplier(GRASS))
    }

    @Test
    fun `multiplier for - WATER against ELECTRO`() {
        //Then
        assertEquals(0.5, WATER.effectivenessMultiplier(ELECTRO))
    }

    //Neutral
    @Test
    fun `multiplier for - WATER against WATER`() {
        //Then
        assertEquals(1.0, WATER.effectivenessMultiplier(WATER))
    }

    @Test
    fun `multiplier for - ELECTRO against ELECTRO`() {
        //Then
        assertEquals(1.0, ELECTRO.effectivenessMultiplier(ELECTRO))
    }

    @Test
    fun `multiplier for - FIRE against FIRE`() {
        //Then
        assertEquals(1.0, FIRE.effectivenessMultiplier(FIRE))
    }

    @Test
    fun `multiplier for - GRASS against GRASS`() {
        //Then
        assertEquals(1.0, GRASS.effectivenessMultiplier(GRASS))
    }

    @Test
    fun `multiplier for - FIRE against ELECTRO`() {
        //Then
        assertEquals(1.0, FIRE.effectivenessMultiplier(ELECTRO))
    }

    @Test
    fun `multiplier for - ELECTRO against FIRE`() {
        //Then
        assertEquals(1.0, ELECTRO.effectivenessMultiplier(FIRE))
    }

    @Test
    fun `multiplier for - WATER against GRASS`() {
        //Then
        assertEquals(1.0, WATER.effectivenessMultiplier(GRASS))
    }

    @Test
    fun `multiplier for - GRASS against WATER`() {
        //Then
        assertEquals(1.0, GRASS.effectivenessMultiplier(WATER))
    }

}