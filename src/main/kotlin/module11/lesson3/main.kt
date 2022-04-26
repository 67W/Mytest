package module11.lesson3

fun main() {
    val person = Person("name", "last name")

//    val (name, lastName) = person

    val name = person.component1()
    val lastName = person.component2()
}