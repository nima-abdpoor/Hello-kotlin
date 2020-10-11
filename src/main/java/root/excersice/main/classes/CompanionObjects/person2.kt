package root.excersice.main.classes.CompanionObjects

class person2 {
    companion object: JsonFactory<Person> {
        override fun fromJsonFactory(jsonString: String): Person {
            return Person(jsonString)
        }
    }
}