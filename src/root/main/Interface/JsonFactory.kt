package root.main.Interface

interface JsonFactory<T> {
    fun fromJsonFactory(jsonString : String) : T
}