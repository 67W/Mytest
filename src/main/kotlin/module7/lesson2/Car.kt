package module7.lesson2

import kotlin.random.Random

class Car(val brand: String, val model: String, val color: String = "White") {

    constructor(descriptor: Pair<String, String>, color: String) : this(
        brand = descriptor.first,
        model = descriptor.second,
        color = color
    ) {
        println("Secondary constructor")
    }

    init {
        println("Car init")
    }

    var currentSpeed = 0.0

    init {
        println("Second init")
    }

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