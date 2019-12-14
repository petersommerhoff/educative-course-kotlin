package _35_collections

fun main() {
    val programmingLanguages = arrayOf("Kotlin", "TypeScript", "Java", "Python", "Scala")
    println(programmingLanguages[0])

    programmingLanguages[0] = "Haskell"
    println(programmingLanguages[0])
}
