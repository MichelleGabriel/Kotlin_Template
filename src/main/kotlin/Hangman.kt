class Hangman(
    val word: String
) {
    private var falseLetters = mutableListOf('#', ' ')
    private var correctLetters: MutableList<Char> = mutableListOf()

    fun guess(letter: Char): String {
        return correctGuesses(letter) + wrongGuesses(letter)
    }

    private fun correctGuesses(letter: Char): String {
        return word.map {
            if (it != letter) {
                '_'
            } else letter
        }.joinToString(" ")
    }

    private fun wrongGuesses(letter: Char): String {
        if (!word.contains(letter)) {
            falseLetters.add(letter)
            return falseLetters.joinToString("", " ")
        } else {
            return ""
        }

    }
}