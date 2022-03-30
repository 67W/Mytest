package module7.lesson1

import kotlin.random.Random

class Car {
    val brand = "Audi"
    val model = "A3"
    val color = "Red"

    fun move(countMoving: Int): Int {
        var totalDistance = 0
        for (i in 0 until countMoving) {
            val distance = Random.nextInt(1, 20)
            println("Car passed $distance km")
            totalDistance += distance
        }
        return totalDistance
    }

    fun start() {
        println("Car started")
    }

    fun stop() {
        println("Car stopped")
    }
}