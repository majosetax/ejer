fun main() {
        println(birthdayGreeting(age = 5))
println(birthdayGreeting(age = 2))

}

fun birthdayGreeting(name: String = "Rover", age: Int): String {
 val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now $age years old!"
    return "$nameGreeting\n$ageGreeting"
}