package module11.lesson4

fun main() {
    val first = Generic<Double>(5.0)
    val second = Generic<Int>(10)
    sum(first, second)
}

fun <T> genericFun(input: T): String {
    return input?.toString() ?: "object is null"
}

fun sum(a: Generic<Number>, b: Generic<Number>): Int? {
    val first = a.item?.toInt() ?: return null
    val second = b.item?.toInt() ?: return null
    return first + second
}