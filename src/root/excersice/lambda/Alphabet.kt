package root.excersice.lambda

class Alphabet {
    fun alphabetWith(): String {
        var stringBuilder = StringBuilder()
        return with(stringBuilder) {
            for (letter in 'a'..'z') {
                this.append(letter)
            }
            append("\nNow I Know The Alphabet")
            this.toString()
        }
    }
    fun alphabetApply() = StringBuilder().apply {
        for (letter in 'a'..'z') {
            this.append(letter)
        }
        append("\nNow I Know The Alphabet")
    }.toString()
}