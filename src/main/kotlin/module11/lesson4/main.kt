package module11.lesson4

import module7.lesson1.Car

fun main() {
    val list: List<String> = List(5) { "" }
    val intList = listOf(1, 2, 3, 4)

    println(genericFun(5))
    println(genericFun("hello"))
    println(genericFun(Car()))
    println(genericFun(null))

    val object1 = Generic<Int>()
    object1.item = 5

    val object2 = Generic<String>()
    object2.item = "Generic String"

    val object3 = Generic<Car>()
    object3.item = Car()

}

fun <T> genericFun(input: T): String {
    return input?.toString() ?: "object is null"
}