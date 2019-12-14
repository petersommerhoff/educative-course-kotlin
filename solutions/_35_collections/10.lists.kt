package _35_collections

// `main` function was given in hidden code
fun main() {

    // Add your code here
    val childhoodFriends = listOf("Tobi", "Fabian")
    val books = mutableListOf("The One Thing", "Clean Architecture", "Unshakeable", "The Daily Stoic")

    // This was given in hidden code
    println("Your best childhood friends were ${childhoodFriends.joinToString()}.")
    println("You've read ${books.joinToString()} in the past half year.")

    books[1] = "Clean Code"

    val message = if (books.size >= 10) {
        "I devour books"
    } else if (books.size >= 5) {
        "I enjoy reading books from time to time"
    } else {
        "I'm more of a sporadic reader of books"
    }
    println(message)
}
