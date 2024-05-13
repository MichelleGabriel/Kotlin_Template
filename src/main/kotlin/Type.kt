enum class Type {
    FIRE, GRASS, WATER, ELECTRO;

    fun effectivenessMultiplier(enemyType: Type): Double {
        when {
            //Super effective
            this == Type.FIRE && enemyType == Type.GRASS -> return 2.0
            this == Type.WATER && enemyType == Type.FIRE -> return 2.0
            this == Type.GRASS && enemyType == Type.ELECTRO -> return 2.0
            this == Type.ELECTRO && enemyType == Type.WATER -> return 2.0

            //Not very effective
            this == Type.GRASS && enemyType == Type.FIRE -> return 0.5
            this == Type.FIRE && enemyType == Type.WATER -> return 0.5
            this == Type.ELECTRO && enemyType == Type.GRASS -> return 0.5
            this == Type.WATER && enemyType == Type.ELECTRO -> return 0.5
        }
        //neutral
        return 1.0
    }
}
