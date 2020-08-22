package root.lambda

class Functional {
    fun function() {
        val club27 = { p: Person -> p.age >= 27 }
        val people = listOf(Person("nima",20)
            , Person("maryam",20)
            ,Person("alisa",30),
            Person("ahmad",31)
        )
        println(people.all(club27))
        println(people.any(club27))
        println(people.count(club27))
        println(people.findLast(club27))
    }
}