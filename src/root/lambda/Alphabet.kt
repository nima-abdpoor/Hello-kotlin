package root.lambda

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
}