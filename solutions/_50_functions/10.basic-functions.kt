package _50_functions

// Multiplication table

fun printMultiplicationTable(rows: IntRange, columns: IntRange) {
    for (row in rows) {
        for (col in columns) {
            System.out.format("%-8d", row * col)
        }
        println()
    }
}


// GCD

// 1) If one of the numbers is zero, the GCD is defined to be the other number
// 2) Otherwise, you can find the GCD using recursion (calling the function inside itself)
fun gcd(a: Int, b: Int): Int {
    if (a == 0) {
        return b
    }
    return gcd(b % a, a)
}


// LCM

// For two numbers a and b, it holds that gcd(a,b) * lcm(a,b) = a * b
// Therefore, lcm(a,b) = a*b / gcd(a,b)
fun lcm(a: Int, b: Int): Long = a.toLong() * b / gcd(a, b)


fun main() {
    println(gcd(54, 24))
    println(gcd(81, 153))
    println(gcd(137, 73))

    println()

    println(lcm(54, 1))
    println(lcm(1, 24))
    println(lcm(3, 7))

    println()

    printMultiplicationTable(rows = 1..5, columns = 1..10)
}