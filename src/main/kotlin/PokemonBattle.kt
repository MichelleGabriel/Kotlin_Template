class PokemonBattle {

    fun calculate(ownType: Type, enemyType: Type, ownAttack: Int, enemyDefense: Int): Int {
        return (50 * (ownAttack / enemyDefense) * ownType.effectivenessMultiplier(enemyType))
            .toInt()
    }
}