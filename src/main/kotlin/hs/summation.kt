package hs

fun sum5(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): Int {
    val sum = a1 + a2 + a3 + a4 + a5
    return sum
}

fun main() {
    val list = readln().split(" ")
    println(list)

    when (list.size) {
        2 -> println(sum5(list[0].toInt(), list[1].toInt(), 0, 0, 0))
        3 -> println(sum5(list[0].toInt(), list[1].toInt(), list[2].toInt(), 0, 0))
        4 -> println(sum5(list[0].toInt(), list[1].toInt(), list[2].toInt(), list[3].toInt(), 0))
        5 -> println(
            sum5(
                list[0].toInt(),
                list[1].toInt(),
                list[2].toInt(),
                list[3].toInt(),
                list[4].toInt()
            )
        )
    }
}
