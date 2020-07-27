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



    val persons = listOf(person("alice",age = 20),person("nima",32),person("ahmad"))
    val oldest = persons.maxBy { it.age ?:0 }
    println("the oldest is : $oldest ")
}
data class person(val name : String,val age : Int ?= null)
