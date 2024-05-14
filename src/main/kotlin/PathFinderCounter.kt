fun getNumberOfReachableFields(grid: Array<Array<Int>>, startRow: Int, startColumn: Int): Int {

    val visited = mutableSetOf<Coordinates>()
    val available = mutableSetOf(Coordinates(startRow, startColumn))

    while (available.isNotEmpty()) {
        val currentCoordinates = available.first()
        visited.add(currentCoordinates)
        available.remove(currentCoordinates)

        //left
        val leftCoordinates = Coordinates(currentCoordinates.y, currentCoordinates.x - 1)

        if (leftCoordinates.x in 0..<grid.first().size && !visited.contains(leftCoordinates) && grid.isReachable(
                leftCoordinates
            )
        ) {
            available.add(leftCoordinates)
        }

        //right
        val rightCoordinates = Coordinates(currentCoordinates.y, currentCoordinates.x + 1)

        if (rightCoordinates.x in 0..<grid.first().size && !visited.contains(rightCoordinates) && grid.isReachable(
                rightCoordinates
            )
        ) {
            available.add(rightCoordinates)
        }

        //forward
        val forwardCoordinates = Coordinates(currentCoordinates.y + 1, currentCoordinates.x)

        if (forwardCoordinates.y in 0..<grid.size && !visited.contains(forwardCoordinates) && grid.isReachable(
                forwardCoordinates
            )
        ) {
            available.add(forwardCoordinates)
        }
    }

    return visited.count { it.y == grid.size - 1 }
}

private fun Array<Array<Int>>.isReachable(nextCoordinates: Coordinates) =
    this[nextCoordinates.y][nextCoordinates.x] == 1

data class Coordinates(
    val y: Int,
    val x: Int
)
