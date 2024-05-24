enum class Stat(val increment: Int) {
    ATTACK(4),
    HEALTH(5),
    ATTACK_SPEED(3),
    RECOVERY(2);

    fun someMethodNameWeAreGoingToDecideLater(level: Int): Int = when (this) {
        ATTACK -> {
            when (level) {
                1 -> ATTACK.increment
                5 -> ATTACK.increment
                else -> 0
            }
        }

        HEALTH -> {
            when (level) {
                2 -> HEALTH.increment
                else -> 0
            }
        }

        else -> 0
    }
}
