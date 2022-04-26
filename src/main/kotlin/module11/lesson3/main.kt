package module11.lesson3

fun main() {
    Color.WHITE
    println(Color.WHITE.hex)
    Color.WHITE.draw()
    Color.RED.draw()

    println(Color.values().joinToString(","))
    println(Color.valueOf("RED").hex)
}