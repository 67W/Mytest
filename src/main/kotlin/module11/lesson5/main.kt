package module11.lesson5

import kotlin.random.Random

fun main() {
    val number = Random.nextInt(1, 10)
    println(number)
    printNumber(number)
}

//fun Int.isEven(): Boolean {
//    return this % 2 == 0
//}

fun printNumber(number: Int) {
//    println(number.isEven())
//    println(5.isEven())

    val a = Int.random()
    val b = Int.random()
    println(number.isEven)
    println(5.isEven)
}

fun Int.Companion.random(): Int {
    return (System.currentTimeMillis() % 43).toInt()
}

val Int.isEven
    get() = this % 2 == 0