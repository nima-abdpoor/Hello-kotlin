package root.main.classes

class Client(private val name  :String ,private val postalCode : Int) {
     override fun toString(): String = "Client(name : $name , postalCode : $postalCode )"

     override fun equals(other: Any?): Boolean {
         val otherClient = other as? Client ?: return false

         return name == otherClient.name && postalCode == otherClient.postalCode
     }

     override fun hashCode(): Int {
         return name.hashCode()*31 + postalCode.hashCode()
     }

    fun copy( name : String = this.name ,PostalCode :Int = this.postalCode ) =
         Client(name , PostalCode)
}