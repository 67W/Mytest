package module11.lesson2

import module8.lesson3.Developer
import module8.lesson3.Person

fun main() {
    val person: Person = Developer("Tony", 40)
    val developer: Developer? = person as? Developer

    developer?.writeCode()
    println(developer?.getLevel())
}