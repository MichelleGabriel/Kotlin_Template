class Equipment {

    private val maxLevel = 3
    private var attack = 1
    private var level = 0

    fun valueFor(stat: Stat): Int {
        return attack
    }

    fun levelUp() {
        if (level < maxLevel) {
            attack++
            level++
        }
    }
}