package root.main.classes

abstract class C : B() {
    override fun B() {
        println("overriding B function ")
    }
}