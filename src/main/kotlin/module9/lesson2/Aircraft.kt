package module9.lesson2

abstract class Aircraft(maxWeight: Int) : Transporter(maxWeight) {
    abstract val brand: String
    abstract val model: String
    abstract val engineCount: Int
    abstract val altitude: Int

    fun addPassenger() {}
    fun getPassenger() {}
    fun getSeatScheme() {}
    fun getInfo() {}
}
