package module7.lesson1

fun main() {
    val auto = Car()

    println("Auto info")
    println("${auto.brand} ${auto.model} ${auto.color} color")
    auto.start()
    println("Input count move:")
    val countMove = readLine()!!.toInt()
    val totalMove = auto.move(countMove)
    auto.stop()
    println("Car moved distance: $totalMove km")
}