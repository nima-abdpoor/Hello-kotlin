package root.main.classes


class Person(val name : String){
    companion object Loader {
        fun getname(_name : String) :Person = Person(_name)
    }
}