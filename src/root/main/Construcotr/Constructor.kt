package root.main.Construcotr

class Constructor constructor(private val _number  :Int , val _parameter : String = "Hi"){
    private var number = 0

    init {
        this.number = _number
    }
    fun getParameter() : String{
        return _parameter
    }
}