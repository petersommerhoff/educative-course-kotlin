package _50_functions

operator fun String.contains(chars: List<Char>): Boolean {
    for (char in chars) {
        if (char !in this) return false
    }
    return true
}


fun main() {
    val requiredChars = listOf('x', 'y')
    println(requiredChars in "xyzäöü")  // true
    println(requiredChars in "x你z")  // false
    println(requiredChars in "y好ä")  // false
}
