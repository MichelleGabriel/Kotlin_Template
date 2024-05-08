class Hangman(
    private val word: String
) {
    private var falseLetters: MutableList<Char> = mutableListOf()
    private var disguisedWord = word.map { '_' }.toCharArray()

    fun guess(letter: Char): String {
        return "${correctGuesses(letter)}${wrongGuesses(letter)}"
    }


    private fun correctGuesses(letter: Char): String {

        word.mapIndexed { index, char ->
            if (char == letter) {
                disguisedWord[index] = letter
            }
        }

        return if (disguisedWord.joinToString("") == word) {
            "# You found the word! ($word)"
        } else {
            disguisedWord.joinToString(" ")
        }
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