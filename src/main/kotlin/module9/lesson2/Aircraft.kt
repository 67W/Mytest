package module9.lesson2

abstract class Aircraft(maxWeight: Int) : Transporter(maxWeight) {
    abstract val brand: String
    abstract val model: String
    abstract val engineCount: Int
    abstract val altitude: Int

    abstract val rows: Int
    abstract val numberOnSeatInRow: Int

    protected val seatScheme by lazy {
        List(rows) {
            MutableList<Passenger?>(numberOnSeatInRow) {
                null
            }
        }
    }

    fun addPassenger(passenger: Passenger) {

    }

    fun getPassenger(seat: Seat): Passenger? {
        return null
    }

    fun getSeatScheme() {}
    fun getInfo() {}
}
