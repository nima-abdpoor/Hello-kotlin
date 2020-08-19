package root.main.classes.CompanionObjects

interface JsonFactory<T> {
    fun fromJsonFactory(jsonString : String) : T
}