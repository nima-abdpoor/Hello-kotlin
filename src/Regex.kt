import kotlin.text.Regex

class Regex {
    fun containsmathin(starting : String,word  :String) : Boolean{
        val pattern = Regex("^"+starting);
        return pattern.containsMatchIn(word)
    }
    fun mathces(regextext : String,word : String): Boolean{
        val pattern= Regex(regextext+"?")
        return pattern.matches(word)
    }
}