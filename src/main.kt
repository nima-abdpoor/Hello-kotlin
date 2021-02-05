import java.lang.ArithmeticException

fun main() {
    val num = 10
    main2 { number, string ->
        (number) ?: string
    }
}

private fun main2(function: (s: String?, s2: String) -> String) {
    try {
        val result = function.invoke(null, "message")
        println(result)
    } catch (e: ArithmeticException) {
        println("this error happened just now : ${e.message}")
    }
    //this is the best IDE
}
