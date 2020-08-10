package root.main.classes

class Outer {
    fun salam(){
        println("salam from Outer Class")
    }
    inner class inner{
        open fun inner3() : Outer = this@Outer
    }
}