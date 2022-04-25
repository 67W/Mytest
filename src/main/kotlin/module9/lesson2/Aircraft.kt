package module9.lesson2

abstract class Aircraft(maxWeight: Int) : Transporter(maxWeight) {
    abstract val brand: String
    abstract val model: String
    abstract val engineCount: Int
    abstract val altitude: Int


    fun addPassenger(passenger: Passenger) {

    }

    fun getPassenger(seat: Seat): Passenger? {
        return null
    }

    fun getSeatScheme() {}
    fun getInfo() {}
}
