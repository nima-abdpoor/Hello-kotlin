package root.main.classes

import root.main.Interface.JsonFactory

class person2 {
    companion object: JsonFactory<Person> {
        override fun fromJsonFactory(jsonString: String): Person {
            return Person(jsonString)
        }
    }
}