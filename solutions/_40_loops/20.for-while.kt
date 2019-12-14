package _40_loops

fun main() {

    // Exercise 1

    for (i in 1..5) {
        for (j in 1..i) {
            print("@")
        }
        println()  // Skips to next line
    }

    println()


    // Exercise 2

    for (i in 1..5) {
        for (j in 1..i) {
            print("@")
        }
        print(" ")
        for (j in i..5) {
            print("@")
        }
        println()
    }

    println()


    // Exercise 3

    val center = 4
    for (i in 0..4) {
        val start = center - i
        val end = center + i
        for (j in 1..start) {
            print(" ")
        }

        for (j in start..end) {
            print("@")
        }

        println()  // Skips to next line
    }
    println("   @@@")

}
