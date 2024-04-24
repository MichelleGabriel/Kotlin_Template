fun findMissingLetter(array: CharArray): Char {
    return (array.first()..array.last()).first { it !in array }

//First Solution
//    for (missingChar in array.first()..array.last()) {
//        if (!array.contains(missingChar)) {
//            return missingChar
//        }
//    }
//    return 'a'
}