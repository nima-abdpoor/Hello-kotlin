package root.higherOrderFunciton

class HigherOrderFun {
    init {
        fun1(10 , 20 )
    }
    val sum = { x : Int , y : Int -> x+y}
    private fun fun1(x : Int,y : Int ){
        println(sum(x,y))
    }
}