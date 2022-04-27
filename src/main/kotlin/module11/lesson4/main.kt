package module11.lesson4

fun main() {
    val list: List<String> = List(5) { "" }
    val intList = listOf(1, 2, 3, 4)
}

fun <T> genericFun(input: T): String {
    return input?.toString() ?: "object is null"
}