package module6.lesson6

fun main() {
    var countNumbers = readLine()!!.toInt()
    while (countNumbers <= 0) {
        println("Error, please input a number greater than zero:")
        countNumbers = readLine()!!.toInt()
    }

    val fullList = forMutListNumbers(countNumbers)
    println(fullList)

    val withPlus7Numbers = withPrefix(fullList)
    println(withPlus7Numbers)

    val uniqCount = uniqNumbersCount(fullList)
    println(uniqCount)

    val sumOfNumbersLength = sumOfLengths(fullList)
    println(sumOfNumbersLength)

    val uniqNumbersList = uniqNumbers(fullList)
    println(uniqNumbersList)

    val mutableMapUniqNumbers = mutableMapOf<String, String>()

    for (entry in uniqNumbersList) {
        print("Введите имя человека с номером телефона $entry: ")
        mutableMapUniqNumbers[entry] = readLine()!!.toString()

    }
    for (entry in mutableMapUniqNumbers.entries) {
        println("Абонент: ${entry.value}. Номер телефона: ${entry.key}")
    }

    mutableMapUniqNumbers.forEach { (key, value) -> println("Абонент: $value. Номер телефона: $key") }

// сортировка по keys
    val sortedMapKeys = mutableMapUniqNumbers.toSortedMap(compareBy<String> { it.length }.thenBy { it })
    println(sortedMapKeys)

// сортировка по values ?? не решено
    val sortedMapValues = mutableMapUniqNumbers.toList().sortedBy { (_, value) -> value}.toMap()

    println(sortedMapValues)

}

fun forMutListNumbers(n: Int): MutableList<String> {
    val list = mutableListOf<String>()
    for (i in 1..n) {
        list += readLine().toString()
    }
    return list
}

fun withPrefix(input: MutableList<String>): MutableList<String> {
    return input.filter { it.startsWith("+7") }.toMutableList()
}

fun uniqNumbersCount(input: MutableList<String>): Int {
    return input.toSet().size
}

fun sumOfLengths(input: MutableList<String>): Int {
    var sumLength = 0
    for (i in input.indices) {
        input[i].length - 1
        sumLength += input[i].length - 1
    }
    return sumLength
}

fun uniqNumbers(input: MutableList<String>): MutableList<String> {
    return input.toSet().toMutableList()
}
