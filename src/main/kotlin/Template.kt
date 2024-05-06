fun getScore(dice: IntArray): Int {

//    Combination	Example roll	Points
//    Straight (1,2,3,4,5 and 6)	6 3 1 2 5 4	1000 points
//    Three pairs of any dice	    2 2 4 4 1 1	750 points
//    Three of 1	                1 4 1 1	1000 points
//    Three of 2	                2 3 4 2 2	200 points
//    Three of 3                	3 4 3 6 3 2	300 points
//    Three of 4	                4 4 4	400 points
//    Three of 5	                2 5 5 5 4	500 points
//    Three of 6	                6 6 2 6	600 points
//    Four of a kind	            1 1 1 1 4 6	 | 2 × Three-of-a-kind score (in example, 2000 pts)
//    Five of a kind	            5 5 5 4 5 5	 | 3 × Three-of-a-kind score (in example, 1500 pts)
//    Six of a kind	                4 4 4 4 4 4	 | 4 × Three-of-a-kind score (in example, 1600 pts)
//    Every 1	                    4 3 1 2 2	100 points
//    Every 5	                    5 2 6	50 points

    var diceResult: Int = 0

    return scoreFromDice(dice)

}

private fun scoreFromDice(dice: IntArray): Int = when {
    dice.isStraight() -> 1000
    dice.hasThreePairs() -> 750
    dice.hasThreeOf(1) -> 1000
    dice.hasThreeOf(2) -> 200
    dice.hasThreeOf(3) -> 300
    dice.hasThreeOf(4) -> 400
    dice.hasThreeOf(5) -> 500
    dice.hasThreeOf(6) -> 600
    else -> 0
}

private fun IntArray.hasThreeOnes() = count { it == 1 } == 3

private fun IntArray.hasThreeTwos() = count { it == 2 } == 3


private fun IntArray.hasThreeOf(diceNumber: Int) = count { it == diceNumber } == 3

private fun IntArray.hasThreeSameTest(diceNumber: Int): Boolean {
    return false
//    forEach { if (it == diceNumber) {
//        return this.groupBy { it }
//            .count{ it.value.size == 3 } == 1
//    } else
//
//    }
}


private fun IntArray.hasThreePairs() = groupBy { a -> a }
    .count { mapEntry -> mapEntry.value.size == 2 } == 3


private fun IntArray.isStraight(): Boolean {
    return this.toSet() == (1..6).toSet()

}
