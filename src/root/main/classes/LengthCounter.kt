package root.main.classes

class LengthCounter {
    var counter : Int = 0
    private set
    fun addWord(word : String){
        counter+=word.length
    }
}