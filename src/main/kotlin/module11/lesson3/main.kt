package module11.lesson3

fun main() {
Color.values().forEach {
    println("${it.name} - ${it.ordinal}")
}
}