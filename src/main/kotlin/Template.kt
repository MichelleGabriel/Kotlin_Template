class Equipment(
    private val rarity: Rarity,
    private val type: EquipmentType
) {
    private var level = 0

    fun valueFor(stat: Stat): Int {
        return type.valueAtLevel(stat, level)
    }

    fun levelUp() {
        if (level < rarity.maxLevel) {
            level++
        }
    }
}
