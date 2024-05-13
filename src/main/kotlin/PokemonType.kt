enum class PokemonType {
    FIRE, GRASS, WATER, ELECTRO;

    fun effectivenessMultiplier(enemyType: PokemonType): Double {
        when {
            //Super effective
            this == PokemonType.FIRE && enemyType == PokemonType.GRASS -> return 2.0
            this == PokemonType.WATER && enemyType == PokemonType.FIRE -> return 2.0
            this == PokemonType.GRASS && enemyType == PokemonType.ELECTRO -> return 2.0
            this == PokemonType.ELECTRO && enemyType == PokemonType.WATER -> return 2.0

            //Not very effective
            this == PokemonType.GRASS && enemyType == PokemonType.FIRE -> return 0.5
            this == PokemonType.FIRE && enemyType == PokemonType.WATER -> return 0.5
            this == PokemonType.ELECTRO && enemyType == PokemonType.GRASS -> return 0.5
            this == PokemonType.WATER && enemyType == PokemonType.ELECTRO -> return 0.5
        }
        //neutral
        return 1.0
    }
}
