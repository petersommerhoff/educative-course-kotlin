package _30_conditions

fun main() {

    // Given
    val age = 19
    val username = "guest"
    val number = 42

    // Check age
    when (age) {
        in 18..21 -> println("Age is between 18 and 21")
    }

    // Check username
    when (username) {
        "admin", "system" -> println("User has root access")
    }

    // Check number
    when {
        number != 17 && number != 42 -> println("The number is not 17 and not 42")
    }
}
