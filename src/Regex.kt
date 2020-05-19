import kotlin.text.Regex

class Regex {
    fun containsmathin(starting : String,word  :String) : Boolean{
        val pattern = Regex("^"+starting);
        return pattern.containsMatchIn(word)
    }
}