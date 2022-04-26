package module11.lesson3

fun main() {
    val map = mutableMapOf(
        1 to "1",
        2 to "2",
        3 to "3"
    )

    for ((key,value) in map) {
        println("$key - $value")
    }
}