package module13.practice

fun main() {
    var input = readLine()!!.toInt()
    while (input <= 0) {
        println("Error, please input a number greater than zero:")
        input = readLine()!!.toInt()
    }
    println(fibFor(input))
//    println(fibRecursion(input))
}

fun fibFor(input: Int): Long {
    var sum1 = 1
    var sum2 = 1
    var fibNumber = sum1 + sum2
    if (input > 3) {
        for (i in 4..input) {
            fibNumber = sum1 + sum2
            sum2 = sum1
            sum1 = fibNumber
        }
    } else {
        if (input == 1) {
            fibNumber = 0
        } else {
            if (input == 2 || input == 3) {
                fibNumber = 1
            }
        }
    }
    return fibNumber.toLong()
}

fun fibRecursion(input: Int): Long {
    return when (input) {
        2, 3 -> {
            return 1
        }
        1 -> {
            return 0
        }
        else -> fibFor(input - 1) + fibFor(input - 2)
    }
}
