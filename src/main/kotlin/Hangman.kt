class Hangman(
    private val word: String
) {
    private var falseLetters: MutableList<Char> = mutableListOf()
    private var disguisedWord = word.map { '_' }.toCharArray()

    fun guess(letter: Char): String {
        return "${correctGuesses(letter)}${wrongGuesses(letter)}"
    }

    private fun correctGuesses(letter: Char): String {
        if (word.contains(letter)) {
            val index = word.indexOf(letter)
            disguisedWord[index] = letter
        }

        return disguisedWord.joinToString(" ")
    }

    private fun wrongGuesses(letter: Char): String {
        if (!word.contains(letter)) {
            falseLetters.add(letter)
            return falseLetters.joinToString("", " # ")
        } else {
            return ""
        }

    }
}