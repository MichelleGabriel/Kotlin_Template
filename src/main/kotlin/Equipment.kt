class Equipment(
    private val rarity: Rarity,
    private val type: EquipmentType
) {
    private var level = 0

    fun valueFor(stat: Stat) = type.valueAt(level, stat)

    fun levelUp() {
        if (level >= rarity.maxLevel) return

        level++
    }
}
