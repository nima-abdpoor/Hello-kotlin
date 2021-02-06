import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.cancelChildren
import kotlinx.coroutines.channels.produce
import kotlinx.coroutines.runBlocking


fun CoroutineScope.produceSquares(number: Int) = produce {
    var n = number
    while (true) {
        n++
        this.send(n)
    }
}

fun main() = runBlocking {
    val square = produceSquares(1)
    repeat(5){
        println(square.receive())
    }
    coroutineContext.cancelChildren()
    println("done!")
}
