package root.excersice.main.classes

open class A{
    open fun A2(){
        println("A : open")
    }
    companion object{
        fun foo(){
            println("like static!!")
        }
    }
}