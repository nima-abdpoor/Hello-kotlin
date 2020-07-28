package main
import Regex
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
    fun typeInferenceMax(a: Int, b: Int) = if (a > b) a else b


    //variable
    val statement = "hi, this is my first variable"
    val question2: Int = 42;
    val question3: Int
    question3 = 20
    val double = 7.6e2
    val float = 7.6e2f
    //println(double+2)

    fun isoddoreven(i: Int): String {
        val messege: String
        if (i % 2 == 0)
            messege = "even"
        else
            messege = "odd"
        return messege
    }


    //println(isoddoreven(3))


    fun sayHello(s: String? = null): String {
        val name: String;
        if (s != null) {
            name = s
        } else name = "Kotlin"
        return name
    }
//    println("Hello, ${sayHello("mehdi")}")
//    println("Hello, ${sayHello("nima\n\n")}")
//    println("Hello, ${sayHello("kotlin\n")}\n${sayHello()}")

//    val main.person = main.person("nima",false)
//    println(main.person.name)
//    println(main.person.ismarried)

    val Rectangle = Rectangle(20, 21)
    println(Rectangle.isSquare)


//    println(max(2, 1))
//    println(Block_Body_Max(2, 1))
//    println(typeInferenceMax(2,1))
}

class person(name: String, ismarried: Boolean) {
    val name = name;
    var ismarried = ismarried;
}

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() {
            return height == width
        }

    //or
    //val isSquare: Boolean = (height == width)

}


