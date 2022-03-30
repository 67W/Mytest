package module7.lesson3

fun main() {
    val toyota = Car(descriptor = "TOYOTA" to "Tundra", color = "Grey")

    // тут спровоцирована ошибка на чтение, fuelCount приватный

    println("Current speed - ${toyota.currentSpeed}")
//    println("Current fuel - ${toyota.fuelCount}")

    toyota.accelerate(100.0)
    println("Current speed - ${toyota.currentSpeed}")
//    println("Current fuel - ${toyota.fuelCount}")

    toyota.decelerate(50.0)
    println("Current speed - ${toyota.currentSpeed}")
//    println("Current fuel - ${toyota.fuelCount}")
}