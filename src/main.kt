fun main(args: Array<String>) {
    //    val regex = Regex();
//    //containmatchin
//    println(regex.containsmathin("A", "asdfaslfj"))
//    println(regex.containsmathin("salam", "salam"))
//    println(regex.containsmathin("salam", "dsalam"+"\n\n"))
//    println()
//    //matches
//    println(regex.mathces("n([iii+])ma","nima"))
//    println(regex.mathces("n([iii+])ma","niiima"))
//    println(regex.mathces("n([iii+])ma","niiiiiiiiiiiiiiiima"))
//    println(regex.mathces("n([iii+])ma","niiiiiiiiiiiiiiiimas"))
//    println()

    //prefer this one
    fun max(a: Int, b: Int): Int {
        return if (a < b) b else a
    }

    fun Block_Body_Max(a: Int, b: Int): Int = if (a > b) a else b
    fun typeInferenceMax(a : Int, b : Int)  = if (a>b) a else b



    println(max(2, 1))
    println(Block_Body_Max(2, 1))
    println(typeInferenceMax(2,1))
}

