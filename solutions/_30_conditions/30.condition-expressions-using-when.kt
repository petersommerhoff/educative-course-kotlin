package _30_conditions

fun main() {
    // Given
    val priority = 4

    // Insert your code here
    val priorityText = when (priority) {
        1 -> "Trivial"
        2 -> "Minor"
        3 -> "Normal"
        4 -> "Major"
        5 -> "Critical"
        else -> "Unknown"
    }

    println("priorityText=$priorityText")
}

// `when` is superior when matching against a set of distinct values like this