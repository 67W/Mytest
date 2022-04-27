package module11.lesson5

fun main() {

}

fun Int.isEven(): Boolean {
    return this % 2 == 0
}

fun printNumber(number: Int) {
    println(number.isEven())
    println(5.isEven())
}