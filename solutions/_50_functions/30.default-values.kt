package _50_functions

fun printMultiplicationTable2(rows: IntRange = 1..10, columns: IntRange = 1..10) {
    for (row in rows) {
        for (col in columns) {
            System.out.format("%-8d", row * col)
        }
        println()
    }
}

fun main() {
    printMultiplicationTable2(rows = 1..3, columns = 1..5)
    println()
    printMultiplicationTable2(rows = 1..3)
    println()
    printMultiplicationTable2(columns = 1..5)
}
