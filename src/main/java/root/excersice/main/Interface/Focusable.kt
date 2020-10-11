package root.excersice.main.Interface

interface Focusable {
    fun setFocus(b: Boolean)=
        println("I ${if (b) "got" else "lost" } focus.")
    fun showOff() = println("Im focusable")
}