class PokemonBattle {
    fun calculate(ownType: String, enemyType: String, ownAttack: Int, enemyDefense: Int): Int {
        //damage = 50 * (attack / defense) * effectiveness
        return 50 * (ownAttack / enemyDefense)
    }

}