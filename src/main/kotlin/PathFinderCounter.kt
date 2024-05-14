fun getNumberOfReachableFields(grid: Array<Array<Int>>, startRow: Int, startColumn: Int): Int {
//    return functional(startRow, startColumn, grid)

    return recursive(grid, Coordinate(startRow, startColumn)).size
}

fun recursive(grid: Array<Array<Int>>, currentField: Coordinate, source: Coordinate = currentField): Set<Coordinate> {
    val possibleFields = mutableSetOf<Coordinate>()

    if (currentField.y == grid.size - 1) {
        possibleFields.add(currentField)
    }

    possibleFields.addIfAvailableRecursive(leftOf(currentField), currentField, source, grid)
    possibleFields.addIfAvailableRecursive(rightOf(currentField), currentField, source, grid)
    possibleFields.addIfAvailableRecursive(bottomOf(currentField), currentField, source, grid)

    return possibleFields
}

private fun MutableSet<Coordinate>.addIfAvailableRecursive(
    target: Coordinate,
    currentField: Coordinate,
    source: Coordinate,
    grid: Array<Array<Int>>
) {
    if (target != source && grid.isReachable(target)) {
        addAll(recursive(grid, target, currentField))
    }
}

private fun functional(startRow: Int, startColumn: Int, grid: Array<Array<Int>>): Int {
    val visited = mutableSetOf<Coordinate>()
    val coordinateQueue = mutableSetOf(Coordinate(startRow, startColumn))

    while (coordinateQueue.isNotEmpty()) {
        val currentCoordinates = coordinateQueue.first()
        coordinateQueue.remove(currentCoordinates)
        visited.add(currentCoordinates)

        coordinateQueue.addIfAvailable(leftOf(currentCoordinates), visited, grid)
        coordinateQueue.addIfAvailable(rightOf(currentCoordinates), visited, grid)
        coordinateQueue.addIfAvailable(bottomOf(currentCoordinates), visited, grid)
    }

    return visited.count { it.y == grid.size - 1 }
}


private fun MutableSet<Coordinate>.addIfAvailable(
    coordinate: Coordinate,
    visited: MutableSet<Coordinate>,
    grid: Array<Array<Int>>
) {
    if (!visited.contains(coordinate) && grid.isReachable(coordinate)) {
        add(coordinate)
    }
}

private fun Array<Array<Int>>.isReachable(nextCoordinates: Coordinate) = this.isInBounds(nextCoordinates) &&
        this[nextCoordinates.y][nextCoordinates.x] == 1

private fun Array<Array<Int>>.isInBounds(coordinates: Coordinate): Boolean =
    coordinates.x in 0..<this.first().size && coordinates.y in indices

fun leftOf(currentCoordinates: Coordinate) = Coordinate(currentCoordinates.y, currentCoordinates.x - 1)

fun rightOf(currentCoordinates: Coordinate) = Coordinate(currentCoordinates.y, currentCoordinates.x + 1)

fun bottomOf(currentCoordinates: Coordinate) = Coordinate(currentCoordinates.y + 1, currentCoordinates.x)

data class Coordinate(
    val y: Int,
    val x: Int
)
