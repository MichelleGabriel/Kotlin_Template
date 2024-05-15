class Equipment(private val rarity: Rarity, private val type: EquipmentType) {

    private var level = 0
    private var typeValue = 2

    fun valueFor(stat: Stat): Int {

        return type.giveMeValueFor(stat, typeValue)
    }


    fun levelUp() {
        if (level < rarity.maxLevel) {
            typeValue += 4
            level++
        }
    }
}