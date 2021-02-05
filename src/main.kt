fun main() {

    val sum1 = {x : Int , y : Int -> x+y}
    val sum2 : (Int, Int) -> Int = {x,y -> x+y }

    val action1 ={ println("done!")}
    val action2 : () -> Unit = { println("done!")}

    action1.invoke()
    println(sum1(10,20))
    println(sum2(10,20))
    action2.invoke()
}
