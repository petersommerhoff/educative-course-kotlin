package _30_conditions

fun main() {
    // Given
    val priority = 4

    // Insert your code here
    val priorityText = if (priority == 1) {
        "Trivial"
    } else if (priority == 2) {
        "Minor"
    } else if (priority == 3) {
        "Normal"
    } else if (priority == 4) {
        "Major"
    } else if (priority == 5) {
        "Critical"
    } else {
        "Unknown"
    }

    println("priorityText=$priorityText")
}

// `if` requires more lines of code and introduces a lot of clutter in this case when compared to `when`