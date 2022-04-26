package module10.lesson4

import kotlin.random.Random

fun main() {
    val train = Train(10000)
    println("capacity - ${train.capacity}")
    train.move()
    println("-----------")
    println()

    val boeing737 = createAndFillBoeing()
    println(boeing737.getInfo())
    boeing737.getSeatScheme()
    printPassengerInfo(boeing737, Seat(0, 'c'))

    println()
    println("-----------------------")
    println()

    val zeppelin = createAndFillZeppelin()
    println(zeppelin.getInfo())
    zeppelin.getSeatScheme()
    printPassengerInfo(zeppelin, Seat(0, 'c'))
}

fun createAndFillBoeing(): Boeing737 {
    val boeing737 = Boeing737()
    val passengerCount = Random.nextInt(1, boeing737.capacity)
    for (i in 0 until passengerCount) {
        val seat = boeing737.getAvailableSeat() ?: return boeing737

        val passenger = Passenger(
            name = "Ivan",
            lastName = "Petrov",
            document = ForeignPassport(
                series = Random.nextInt(1000, 9999).toString(),
                number = Random.nextInt(100000, 999999).toString()
            ),
            seat = seat
        )
        boeing737.addPassenger(passenger)
    }
    return boeing737
}

fun createAndFillZeppelin(): Zeppelin {
    val zeppelin = Zeppelin()
    val zeppelinPassengers = Random.nextInt(1, zeppelin.capacity)
    for (i in 0 until zeppelinPassengers) {
        val seat = zeppelin.getAvailableSeat() ?: return zeppelin

        val passenger = Passenger(
            name = "Alex",
            lastName = "Ivanov",
            document = DeputyID(
                number = Random.nextInt(100000, 999999).toString()
            ),
            seat = seat
        )
        zeppelin.addPassenger(passenger)
    }
    return zeppelin
}

fun printPassengerInfo(aircraft: Aircraft, seat: Seat) {
    aircraft.getPassenger(seat)
        ?.getInfo()
        ?.let { println(it) }
        ?: println("there is no passenger")
}