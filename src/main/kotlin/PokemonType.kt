enum class PokemonType {
    FIRE, GRASS, WATER, ELECTRO;

    private val notVeryEffective = 0.5
    private val superEffectiveMultiplier = 2.0
    private val neutralMultiplier = 1.0

    fun effectivenessMultiplier(enemyType: PokemonType): Double {
        return when {
            this == FIRE && enemyType == GRASS -> superEffectiveMultiplier
            this == WATER && enemyType == FIRE -> superEffectiveMultiplier
            this == GRASS && enemyType == ELECTRO -> superEffectiveMultiplier
            this == ELECTRO && enemyType == WATER -> superEffectiveMultiplier

            this == GRASS && enemyType == FIRE -> notVeryEffective
            this == FIRE && enemyType == WATER -> notVeryEffective
            this == ELECTRO && enemyType == GRASS -> notVeryEffective
            this == WATER && enemyType == ELECTRO -> notVeryEffective

            else -> neutralMultiplier
        }
    }
}