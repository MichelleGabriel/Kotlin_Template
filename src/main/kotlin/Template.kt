fun toCamelCase(str: String): String {
    val camelCaseString = str
        .split('-', '_')
        .map { string -> string.replaceFirstChar { it.uppercase() } }
        .joinToString("")
        .replaceFirstChar { str.first() }

    val camelCaseString2 = str
        .split('-', '_')
        .upperCaseStartFromSecond()
        .joinToString("")

    val camelCaseString3 = str
        .replace("[_-]".toRegex(), "")

    return camelCaseString2
}

private fun List<String>.upperCaseStartFromSecond() = mapIndexed { index, string ->
    if (index == 0) {
        string
    } else {
        string.replaceFirstChar { it.uppercase() }
    }
}
