fun points(games: List<String>) =
    games.sumOf {
        val (x, y) = it.split(":")
        when {
            x > y -> 3
            x < y -> 0
            else -> 1
        }.toInt()
    }

// Own solution>
// return games.count { it.first() > it.last() } * 3 + games.count{ it.first() == it.last()}
// -> Edgecase, wenn Punkte mehrstellig sind funktioniert meine Loseung nicht.