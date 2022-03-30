package module7.lesson4

fun main() {
val tower1 = EiffelTower
    val tower2 = EiffelTower
    println("Tower 1 backlights on? - ${tower1.backlightsOn}")
    println("Tower 1 backlights on? - ${tower1.backlightsOn}")

    tower1.turnOnBacklights()
    println("Tower 1 backlights on? - ${tower1.backlightsOn}")
    println("Tower 1 backlights on? - ${tower1.backlightsOn}")

    println("Wheels count - ${Car.wheelsCount}")
    val classType = Car.getCarClass(3.8)
    println(classType)

    val car = Car("Audi","A3")

// нельзя обратиться к объекту, который находится внутри класса
//    car.getCarClass()
}