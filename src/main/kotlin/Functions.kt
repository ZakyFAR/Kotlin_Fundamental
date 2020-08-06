fun main() {
    val user = setUser("Zaky","Swimming", 16)
    println(user)
}

fun setUser(name: String,hoby:String, age: Int) = "My name is $name, I like $hoby, and I'M  $age years old"
