package root.main.Construcotr

open class User(val name : String) {
    var address: String = "unspecified"
    set(value : String) {
        println("" +
                "address was changed for $name:" +
                "$field -> $value".trimIndent())
        field = value
    }
}