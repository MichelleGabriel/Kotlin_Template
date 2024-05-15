class Equipment(private val rarity: Rarity, private val type: EquipmentType) {

    private var level = 0
    private var typeValue = 2

    fun valueFor(stat: Stat): Int {

        if (type == EquipmentType.WEAPON) {
            return when (stat) {
                Stat.ATTACK -> typeValue
                else -> 0
            }
        }
        if (type == EquipmentType.CHEST) {
            return when (stat) {
                Stat.HEALTH -> typeValue
                else -> 0
            }
        }

        if (type == EquipmentType.GLOVES) {
            return when (stat) {
                Stat.ATTACK_SPEED -> typeValue
                else -> 0
            }
        }

        if (type == EquipmentType.HEAD) {
            return when (stat) {
                Stat.RECOVERY -> typeValue
                else -> 0
            }
        }

        return 0
    }

    fun levelUp() {
        if (level < rarity.maxLevel) {
            typeValue += 4
            level++
        }
    }
}