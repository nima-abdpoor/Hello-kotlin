package root.excersice.android

object Repository {

    private var users: MutableList<User>? = null
    fun getUsers(): List<User>? {
        return users
    }

    val formattedUserNames: List<String>
        get() {
            val userNames: MutableList<String> =
                ArrayList(users!!.size)
            for (user in users!!) {
                var name: String = if (user!!.lastName != null) {
                    if (user!!.firstName != null) {
                        user!!.firstName + " " + user!!.lastName
                    } else {
                        user!!.lastName!!
                    }
                } else if (user!!.firstName != null) {
                    user!!.firstName!!
                } else {
                    "Unknown"
                }
                userNames.add(name)
            }
            return userNames
        }

    // keeping the constructor private to enforce the usage of getInstance
    init {
        val user1 = User("Jane", "")
        val user2 = User("John", null)
        val user3 = User("Anne", "Doe")
        users = ArrayList()
        (users as ArrayList<User>).add(user1)
        (users as ArrayList<User>).add(user2)
        (users as ArrayList<User>).add(user3)
    }
}