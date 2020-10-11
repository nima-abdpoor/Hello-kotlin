package root.excersice.lambda

import java.util.ArrayList

class DifferenceOfSequenceAndTerminal {
    var list = ArrayList<Int>()
    constructor(){
            for (x in 0..100) {
                list.add(x)
            }
    }


    fun sequence() {
        println("sequence: " + list.asSequence().map { it * it }.find { it > 100 })
    }

    fun terminal() {
        println("terminal : "+list.map { it * it }.find { it > 100 })
    }
}