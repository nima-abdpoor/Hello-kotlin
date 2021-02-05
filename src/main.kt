fun main() {
    val url  = "https://nima.com"
    performRequest(url){code , content ->
        println("the code is $code and the content is $content")
    }
}
fun performRequest(
    url : String,
    callback: (Int, String) -> Unit = { code : Int, content : String -> Boolean}
){
    callback.invoke(getData(url),"this the content")
}

fun getData(url :String):Int{
    return url.length
}
