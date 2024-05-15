class Equipment {

    private var attack: Stat = Stat.Attack

    fun valueFor(stat: Stat): Int {
        return stat.value
    }

    fun levelUp() {
        attack.value++
    }
}