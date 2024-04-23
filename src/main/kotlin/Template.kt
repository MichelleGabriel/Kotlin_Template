fun duplicateCount(text: String): Int {
    var duplicate = 0
    val groupingBy = text.groupBy { it }
//    Fuer jede List(Char) pruefe ob der Wert > 1. Wenn ja zieh Zaehler hoch.



    groupingBy.forEach {
        if (it.value.size > 1) {
           duplicate++
        }
    }
    return duplicate
}