package module11.lesson4

import module8.lesson3.Developer
import module8.lesson3.Person

fun main() {
    val first = Generic<Double>(5.0)
    val second = Generic<Int>(10)
    println(first.getItem())
    println(second.getItem())
    println(sum(first, second))

    val developer = Developer("Tony", 40)
    printDeveloper(Printer<Person>(), developer)
}

fun <T> genericFun(input: T): String {
    return input?.toString() ?: "object is null"
}

fun sum(a: Generic<Number>, b: Generic<Number>): Int? {
    val first = a.getItem()?.toInt() ?: return null
    val second = b.getItem()?.toInt() ?: return null
    return first + second
}

fun printDeveloper(printer: Printer<Developer>, developer: Developer) {
//some logic
    printer.print(developer)
}