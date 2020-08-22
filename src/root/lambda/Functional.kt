package root.lambda

class Functional {
    val club27 = { p: Person -> p.age >= 27 }
    val people = listOf(Person("nima",20)
        , Person("maryam",20)
        ,Person("alisa",30),
        Person("ahmad",31)
    )
    fun function() {
        println(people.all(club27))
        println(people.any(club27))
        println(people.count(club27))
        println(people.findLast(club27))
    }
    fun groupby(){
        println(people
            .groupBy {it.name.first().equals('m') || it.name.first().equals('n')}
            .map {it.value.get(0)})

    }
}