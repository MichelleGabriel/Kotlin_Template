class PokemonBattle {
    fun calculate(ownType: Type, enemyType: Type, ownAttack: Int, enemyDefense: Int): Int {
        //damage = 50 * (attack / defense) * effectiveness
        return 50 * (ownAttack / enemyDefense) * ownType.calculateEffectivenessMultiplier(enemyType)
    }

}