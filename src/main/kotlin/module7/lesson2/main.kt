package module7.lesson2

fun main() {
//    val vw = Car(brand = "VW", model = "Beetle", color = "Green")
//    val lada = Car(brand = "Lada", model = "Vesta", color = "Yellow")
//    val bmw = Car(brand = "BMW", model = "X6")
//    printInfo(vw)
//    printInfo(lada)
//    printInfo(bmw)

    // этот код вызывает только первичный конструктор init
    val toyota = Car(brand = "TOYOTA", model = "Tundra", color = "Grey")
    println("Сначала вызывается Car init потом Second init и на этом заканчивается программа")

    println()

    // этот код вызывает функцию из тела конструктора после исполнения всех блоков init
    val renault = Car(descriptor = "Renault" to "Logan", color = "Green")
    println("Сначала вызывается Car init потом Second init и затем вызывается тело конструктора Secondary constructor")


// просто печать
//    printInfo(toyota)
//    printInfo(renault)
}

fun printInfo(car: Car) {
    println("Brand - ${car.brand}, model - ${car.model}, color - ${car.color}")
}