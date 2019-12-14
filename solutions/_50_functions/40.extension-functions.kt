package _50_functions

import java.util.*

// Exercise 1

fun Date.plusMinutes(minutes: Int) = Date(this.time + minutes * 1000 * 60)


// Exercise 2

fun String.removeAll(substr: String): String {
    var current = this
    do {
        val previous = current
        current = previous.replace(substr, "")
    } while(current != previous)

    return current
}


fun main() {
    val now = Date()
    val in5Minutes = now.plusMinutes(5)
    println(in5Minutes)

    println()

    val original = "Extension functions allow you to attach new functions to existing types *including ones that you don't own*"
    val edited1 = original.removeAll("*")  // Should remove both *
    val edited2 = original.removeAll("you")  // Should remove all "you"s
    
    println(original)
    println(edited1)
    println(edited2)
}