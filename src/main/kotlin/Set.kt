class Set {
    private var count = 0
    private var intArray = intArrayOf(0, 0)

    fun isEmpty(): Boolean = count == 0

    fun add(number: Int) {
        if (!contains(number)) {
            intArray[count] = number
            count++
        }

    }

    fun count(): Int {
        return count
    }

    fun contains(number: Int): Boolean {
        for (index in 0..<count) {
            if (intArray[index] == number) {
                return true
            }
        }
        return false
    }

    fun remove(number: Int) {
        val newIntArray = intArrayOf(count - 1)
        var newCount = 0

        for (index in 0..<count) {
            if (intArray[index] != number) {
                newIntArray[newCount] = intArray[index]
                newCount++
            }
        }

        intArray = newIntArray
        count = newCount
    }
}

