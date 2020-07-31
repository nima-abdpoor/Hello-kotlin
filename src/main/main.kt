package main

import jdk.internal.joptsimple.internal.Strings
import java.awt.image.renderable.RenderContext
import java.lang.Exception
import java.util.*
import kotlin.time.measureTime

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
    //println(Rectangle.isSquare)


//    println(max(2, 1))
//    println(Block_Body_Max(2, 1))
//    println(typeInferenceMax(2,1))


    //ENUM
    println(Color.Green)
    println(Color.Blue.rgb())
    fun getMnemonic(color: Color): String {
        return when (color) {
            Color.Red -> "Rechard"
            Color.Orange -> "Of"
            Color.Yellow -> "York"
            Color.Green -> "Gave"
            Color.Blue -> "Battle"
            Color.Indigo -> "In"
            Color.Violet -> "Vain"
        }
    }
    println(getMnemonic(Color.Blue))

    fun getWarmth(color: Color): String {
        return when (color) {
            Color.Orange, Color.Red,
            Color.Yellow -> "Warm"
            Color.Green -> "neutral"
            Color.Blue, Color.Indigo, Color.Violet -> "cold"
        }
    }
    println(getWarmth(Color.Yellow))

    //less code , easy read, easy write
    fun Mix(color1: Color, color2: Color) =
        when (setOf<Color>(color1, color2)) {
            setOf(Color.Red, Color.Yellow) -> "ORANGE"
            setOf(Color.Yellow, Color.Blue) -> "GREEN"
            setOf(Color.Blue, Color.Violet) -> "INDIGO"
            else -> throw Exception("Dirty Color!!")
        }
    //println(Mix(Color.Yellow,Color.Red))

    //more code,optimized,harder to read
    fun OptimizedMix(color1: Color, color2: Color) =
        when {
            (color1 == Color.Red && color2 == Color.Yellow)
                    || (color1 == Color.Yellow && color2 == Color.Red) -> "ORANGE"
            (color1 == Color.Yellow && color2 == Color.Blue)
                    || (color1 == Color.Blue && color2 == Color.Yellow) -> "GREEN"
            (color1 == Color.Violet && color2 == Color.Blue)
                    || (color1 == Color.Blue && color2 == Color.Violet) -> "INDIGO"
            else -> throw Exception("Dirty Color!!")
        }
    //println(OptimizedMix(Color.Blue,Color.Yellow))

    //while and do while
    var variable = 1
    while (variable != 10) {
        //println(variable)
        variable++;
    }
    do {
        //println(variable)
        variable++
    } while (variable != 12)

    //for
    for (i in 100 downTo 20 step 3) {
        //println(i)
    }

    for (i in 0..10) {
        //    println(i)
    }

    val binaryReps = TreeMap<Char, String>()
    for (c in 'A'..'Z') {
        var binary = Integer.toBinaryString(c.toInt())
        binaryReps[c] = binary
    }
    for ((letter, binary) in binaryReps) {
        //    println("$letter = $binary")
    }
    val list = arrayListOf<String>("10", "11", "101")
    for ((index, element) in list.withIndex()) {
        //println("$index = $element")
    }
    //in and !in
    fun isLetter(c: Char) = c in 'A'..'Z' || c in 'a'..'z'
    fun isNotDigit(c: Char) = c !in '0'..'9'

//    println(isNotDigit('8'))
////    println(isLetter('A'))
////    println(isNotDigit('a'))

    fun Recognize(c: Char) =
        when (c) {
            in 'a'..'z' -> "small letter"
            in 'A'..'Z' -> "capital letter"
            in '0'..'9' -> "Digit"
            else -> throw Exception("fuck off!")
        }

    //println(Recognize('9'))
    fun division(number1: Int, number2: Int) =
        try {

            number1 / number2
        } catch (e: java.lang.ArithmeticException) {
            null
        }

    //println(division(1,0))
}

enum class Color(val r: Int, val g: Int, val b: Int) {
    Red(255, 0, 0), Blue(0, 0, 255), Orange(255, 165, 0), Yellow(255, 255, 0),
    Green(0, 255, 0), Indigo(75, 0, 135), Violet(238, 130, 238);

    fun rgb() = (r * 256 + g) * 256 + b;

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

class Collections {
    val strings = setOf("one", "two", "three", "for")
    val numbers = listOf(1, 2, 3)
    val map = hashMapOf("one" to 1, "Two" to 2, "three" to 3)
    fun print() {
        var collection = Collections()
        println(collection.strings.javaClass)
        println(collection.numbers.javaClass)
        println(collection.map.javaClass)
        println(collection.strings.last())
        println(collection.numbers.max())
        for (v in collection.map.values.sorted())
            println(v)
    }

    fun <T> jointoString(
        collection: Collection<T>
        ,separator: String = ", "
        , prefix: String = ""
        , postfix: String = ""
    ): String {
        return ""
    }
}


