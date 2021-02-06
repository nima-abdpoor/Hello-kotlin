import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


fun main() = runBlocking{
    val channel  = Channel<Int>()
   launch{
        for ( x in 1..5){
            channel.send(x*x)
        }
       channel.close()
   }
    launch {
        for ( y in 1..6){
            println(channel.receive())
        }
    }
    println("done!")
}
