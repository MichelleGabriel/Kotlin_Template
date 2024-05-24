import Stat.*

enum class EquipmentType(private val primaryStat: Stat) {
    CHEST(HEALTH),
    WEAPON(ATTACK),
    GLOVES(ATTACK_SPEED),
    HEAD(RECOVERY);

    fun valueAtLevel(stat: Stat, level: Int) = if (stat == primaryStat) 2 + stat.baseValue * level else 0
}
