package root.excersice.main.classes

abstract class C : B() {
    override fun B() {
        println("overriding B function ")
    }
}