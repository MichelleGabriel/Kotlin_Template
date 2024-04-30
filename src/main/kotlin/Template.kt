object EnoughIsEnough {
    fun deleteNth(elements: IntArray, maxOcurrences: Int): IntArray {

        //Wenn elements, das element oefter als maxOccurences beinhaltet,
        // remove es jedes Mal wenn es erneut auftaucht.

        return elements
            .filterIndexed() { index, element ->
                elements
                    .slice(0..index)
                    .count { it == element } <= maxOcurrences
            }
            .toIntArray()
        //FilterIndexed wie ein Laufband vorstellen.
        //Es gibt eine Liste zurueck mit all den Elementen die die Bedingung eruellen
    }
}