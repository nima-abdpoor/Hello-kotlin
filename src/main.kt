fun main(args: Array<String>) {
    val regex = Regex();
    //containmatchin
    println(regex.containsmathin("A", "asdfaslfj"))
    println(regex.containsmathin("salam", "salam"))
    println(regex.containsmathin("salam", "dsalam"+"\n\n"))
    println()
    //matches
    println(regex.mathces("n([iii+])ma","nima"))
    println(regex.mathces("n([iii+])ma","niiima"))
    println(regex.mathces("n([iii+])ma","niiiiiiiiiiiiiiiima"))
    println(regex.mathces("n([iii+])ma","niiiiiiiiiiiiiiiimas"))
    println()
    
}