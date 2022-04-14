package module10.lesson1

class DiskPhone : CallReceiver {
    override val vendor = "Tesla"
    override fun call(number: String) {
        println("Disk phone calling $number")
    }
}