fun getCount(str: String): Int {

    val vowels = listOf('a', 'i', 'u', 'e', 'o')
    var vowelCount = 0

//    return str.count { it in vowels}
//    return str.count { it in listOf('a','i','u','e','o')}

    for (i in str.indices) {

        if (vowels.contains(str[i])) {
            vowelCount++
        }
    }

    return vowelCount

}
