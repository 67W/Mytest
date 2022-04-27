package module11.lesson4

import module11.lesson3.Person
import module7.lesson1.Car
import module8.lesson3.Developer

fun main() {

    val object1 = Generic(5)
    val object2 = Generic("Generic String")
    val object3 = Generic(Car())

    val person = Generic<Person>(Person("Tony", "Noname"))
    person.setItem(Developer("Developer", 25))
}

fun <T> genericFun(input: T): String {
    return input?.toString() ?: "object is null"
}