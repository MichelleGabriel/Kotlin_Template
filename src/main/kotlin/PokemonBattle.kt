class PokemonBattle {
    fun calculate(ownType: Type, enemyType: Type, ownAttack: Int, enemyDefense: Int): Int {
        //damage = 50 * (attack / defense) * effectiveness
        return 50 * (ownAttack / enemyDefense) * calculateEffectiveness(ownType, enemyType)
    }

    private fun calculateEffectiveness(ownType: Type, enemyType: Type): Int {
        when {
            ownType == Type.FIRE && enemyType == Type.GRASS -> return 2
            ownType == Type.WATER && enemyType == Type.FIRE -> return 2
        }
        return 1
    }

}