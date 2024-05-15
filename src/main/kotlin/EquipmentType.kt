enum class EquipmentType {

    CHEST,
    WEAPON,
    GLOVES,
    HEAD, ;

    fun giveMeValueFor(stat: Stat, defaultValue: Int): Int {

        if (this == EquipmentType.WEAPON) {
            return when (stat) {
                Stat.ATTACK -> defaultValue
                else -> 0
            }
        }
        if (this == EquipmentType.CHEST) {
            return when (stat) {
                Stat.HEALTH -> defaultValue
                else -> 0
            }
        }

        if (this == EquipmentType.GLOVES) {
            return when (stat) {
                Stat.ATTACK_SPEED -> defaultValue
                else -> 0
            }
        }

        if (this == EquipmentType.HEAD) {
            return when (stat) {
                Stat.RECOVERY -> defaultValue
                else -> 0
            }
        }

        return 0
    }


}


