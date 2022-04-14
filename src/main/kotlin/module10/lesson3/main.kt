package module10.lesson3

import module10.lesson1.Callable

fun main() {
    val anonymous = object :Callable{
        val name = "anonymous"
        val lastName = "object"
        fun method() = println("anonymous object")
        override val vendor = "anonymous object"

        override fun call(number: String) {
            println("anonymous object calling")
        }
    }
    anonymous.name
    anonymous.lastName
    anonymous.method()
}