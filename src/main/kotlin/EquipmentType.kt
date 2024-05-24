import Stat.*

enum class EquipmentType(private val primaryStat: Stat) {
    CHEST(HEALTH),
    WEAPON(ATTACK),
    GLOVES(ATTACK_SPEED),
    HEAD(RECOVERY);

    fun valueAt(level: Int, stat: Stat) = if (stat == primaryStat) 2 + stat.increment * level else 0
}
