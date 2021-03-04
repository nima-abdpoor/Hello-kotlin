package root
import root.higherOrderFunciton.HigherOrderFun
import kotlin.system.measureTimeMillis


fun main(args: Array<String>) {
    //fun1()
    val h1 = HigherOrderFun()
}

fun fun1() {
    var result: Long
    var size = 20_000_000
    val array = IntArray(size + 1)
    for (x in 0..size) {
        array[x] = x
    }
    val time = measureTimeMillis {
        result = compute(array, 0, size)
    }
    println("$result in $time ms")
}

private const val variable = 5000
fun compute(array: IntArray, low: Int, high: Int): Long {
    return if (high - low <= variable) {
        (low until high)

            .map {
                array[it].toLong()
            }
            .sum()
    } else {
        val mid = (low + high) / 2
        val left =  compute(array, low, mid)
        val right = compute(array, mid, high)
        return left + right
    }
}