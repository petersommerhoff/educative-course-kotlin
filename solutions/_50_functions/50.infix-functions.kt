package _50_functions

infix fun String.withoutLast(substr: String): String {
    return this.substringBeforeLast(substr) + this.substringAfterLast(substr)
}


fun main() {
    println("What's up Kotlin?" withoutLast "up")
    println("What's up up Kotlin?" withoutLast "up")
    println("What's up upKotlin?" withoutLast "up")
}