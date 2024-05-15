class Equipment(private val rarity: Rarity) {

    private var level = 0
    private var attack = 2

    fun valueFor(stat: Stat): Int {
        return when (stat) {
            Stat.ATTACK -> attack
            else -> 0
        }
    }

    fun levelUp() {
        if (level < rarity.maxLevel) {
            attack += 4
            level++
        }
    }
}