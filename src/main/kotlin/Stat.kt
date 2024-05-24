enum class Stat(val increment: Int) {
    ATTACK(4),
    HEALTH(5),
    ATTACK_SPEED(3),
    RECOVERY(2);

    fun someMethodNameWeAreGoingToDecideLater(level: Int): Int = when (this) {
        ATTACK -> {
            when (level) {
                1 -> 4
                5 -> 4
                else -> 0
            }
        }

        HEALTH -> {
            when (level) {
                2 -> 5
                else -> 0
            }
        }

        else -> 0
    }
}
