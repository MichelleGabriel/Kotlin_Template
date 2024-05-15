class Equipment(rarity: Rarity) {

    private val maxLevel = rarity.maxLevel
    private var level = 0
    private var attack = 2

    fun valueFor(stat: Stat): Int {
        return when (stat) {
            Stat.ATTACK -> attack
            else -> 0
        }
    }

    fun levelUp() {
        if (level < maxLevel) {
            attack += 4
            level++
        }
    }
}