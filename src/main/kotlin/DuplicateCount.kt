fun duplicateCount(text: String): Int {
    var duplicate = 0
    val groupingBy = text.lowercase().groupBy { it }

//    val groupingBy2 = text
//        .lowercase()
//        .groupBy { it }
//        .values.count{it.size > 1}
//
//    val groupingBy3 = text
//        .lowercase()
//        .groupBy { it }
//        .count{it.value.size > 1}

    groupingBy.forEach {
        if (it.value.size > 1) {
           duplicate++
        }
    }
    return duplicate
}