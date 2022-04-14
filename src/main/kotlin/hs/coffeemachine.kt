package hs

fun main() {
    val oneCupWater = "200".toInt()
    val oneCupMilk = "50".toInt()
    val oneCupGramBeans = "15".toInt()

    val inputWater = readln().toInt()
    val inputMilk = readln().toInt()
    val inputGramBeans = readln().toInt()
    val inputCups = readln().toInt()

    val list = mutableListOf<Int>()
    list += inputWater / oneCupWater
    list += inputMilk / oneCupMilk
    list += inputGramBeans / oneCupGramBeans

    val minCups = minOf(list[0], list[1], list[2])

    val resultCups = minCups - inputCups

    printInput(inputWater, inputMilk, inputGramBeans, inputCups, minCups, resultCups)
}

private fun printInput(
    inputWater: Int,
    inputMilk: Int,
    inputGramBeans: Int,
    inputCups: Int,
    minCups: Int,
    resultCups: Int
) {
    println("Write how many ml of water the coffee machine has: $inputWater")
    println("Write how many ml of milk the coffee machine has: $inputMilk")
    println("Write how many grams of coffee beans the coffee machine has: $inputGramBeans")
    println("Write how many cups of coffee you will need: $inputCups")
    println(printAnswer(resultCups, minCups))
}

private fun printAnswer(resultCups: Int, minCups: Int): String {
    return when {
        resultCups >= 1 -> "Yes, I can make that amount of coffee (and even $resultCups more than that)"
        resultCups == 0 -> "Yes, I can make that amount of coffee"
        else -> "No, I can make only $minCups cups of coffee"
    }
}