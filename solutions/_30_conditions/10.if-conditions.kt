package _30_conditions

fun main() {

    // Given
    val age = 19
    val username = "guest"
    val number = 42

    // Check age
    if (age in 18..21) {
        println("Age is between 18 and 21")
    }

    // Check username
    if (username == "admin" || username == "system") {
        println("User has root access")
    }

    // Check number
    if (number != 17 && number != 42) {
        println("The number is not 17 and not 42")
    }
}
