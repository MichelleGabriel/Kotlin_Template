class PokemonBattle {

    fun calculate(ownType: PokemonType, enemyType: PokemonType, ownAttack: Int, enemyDefense: Int): Int {
        return (50 * (ownAttack / enemyDefense) * ownType.effectivenessMultiplier(enemyType))
            .toInt()
    }
}