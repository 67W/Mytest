package module11.lesson2

import module8.lesson3.Developer
import module8.lesson3.Person

fun main() {
    val developer = Developer("Tony", 40)
    developer.writeCode()
    developer.getLevel()

    val person: Person = developer
}