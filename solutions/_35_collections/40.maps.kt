package _35_collections

fun main() {
    // Use mapOf() and listOf() initially for the readonly versions
    val achievements = mutableMapOf(
            2017 to mutableListOf("Holidays", "Growth on Udemy"),
            2018 to mutableListOf("Writing 'Kotlin for Android app development' with Pearson"),
            2019 to mutableListOf("M.Sc. in CS", "Full stack developer job", "Publishing of 'Kotlin for Android app development'")
    )

    // You can call `achievements.toMutableMap()` to transform an existing readonly map to a mutable one, try it

    achievements[2016] = mutableListOf("First course on Udemy", "Trip to Beijing")

    achievements.remove(2019)

    // Note the use of the safe call operator
    achievements[2018]?.add("First time at KotlinConf")
}
