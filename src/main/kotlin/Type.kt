enum class Type {
    FIRE, GRASS, WATER, ELECTRO;

    fun calculateEffectivenessMultiplier(enemyType: Type): Int {
        when {
            this == Type.FIRE && enemyType == Type.GRASS -> return 2
            this == Type.WATER && enemyType == Type.FIRE -> return 2
            this == Type.GRASS && enemyType == Type.ELECTRO -> return 2
            this == Type.ELECTRO && enemyType == Type.WATER -> return 2
        }
        return 1
    }
}
