fun evenNumbers(array: List<Int>, number: Int): List<Int> {
    return array.map { if (it % 2 == 0) {
        it
    }}.takeLast(number)
}