package _50_functions

// Initial version (already with single expression in body)
fun fib1(n: Int): Long {
    return if (n < 2) {
        1
    } else {
        fib1(n - 1) + fib1(n - 2)
    }
}

// Using shorthand notation
fun fib(n: Int): Long = if (n < 2) 1 else fib(n - 1) + fib(n - 2)
