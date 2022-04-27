package module11.lesson4

import module7.lesson1.Car

fun main() {
    val list: List<String> = List(5) { "" }
    val intList = listOf(1, 2, 3, 4)

    println(genericFun(5))
    println(genericFun("hello"))
    println(genericFun(Car()))
    println(genericFun(null))

    val object1 = Generic(5)
    val object2 = Generic("Generic String")
    val object3 = Generic(Car())

}

fun <T> genericFun(input: T): String {
    return input?.toString() ?: "object is null"
}