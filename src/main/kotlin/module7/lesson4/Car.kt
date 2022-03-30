package module7.lesson4

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
        private set

    private var fuelCount = 0.0


    init {
        println("Second init")
    }

    fun accelerate(speed: Double) {
        val needFuel = speed * 0.1
        if (fuelCount > needFuel) {
            currentSpeed += speed
            useFuel(needFuel)
        } else {
            println("Car has not enough fuel")
        }
    }

    fun decelerate(speed: Double) {
        currentSpeed = maxOf(0.0, currentSpeed - speed)

// 1 вариант
// if else можно щаменить. Это тоже самое, что и maxOf, но больше в написании
//        val finalSpeed = currentSpeed - speed
//        if (finalSpeed < 0) {
//            currentSpeed = 0.0
//        } else {
//            currentSpeed = finalSpeed
//        }

// 2 вариант
// А это интересное написание if else в присваивании значения переменной сразу
//        val finalSpeed = currentSpeed - speed
//        currentSpeed = if (finalSpeed < 0) 0.0
//        else finalSpeed
    }

    private fun useFuel(fuelCount: Double) {
        this.fuelCount -= fuelCount
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

    companion object {
        const val wheelsCount = 4
        fun getCarClass(length: Double): String = when {
            length < 3.6 -> "A"
            length < 3.9 -> "B"
            length < 4.3 -> "C"
            length < 4.6 -> "D"
            length < 5 -> "E"
            else -> "F"
        }
    }
}