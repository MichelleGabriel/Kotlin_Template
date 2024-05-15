enum class EquipmentType(private val primaryStat: Stat) {
    CHEST(Stat.HEALTH),
    WEAPON(Stat.ATTACK),
    GLOVES(Stat.ATTACK_SPEED),
    HEAD(Stat.RECOVERY);

    fun valueAtLevel(stat: Stat, level: Int)  = if (stat == primaryStat) 2 + 4 * level else 0
}
