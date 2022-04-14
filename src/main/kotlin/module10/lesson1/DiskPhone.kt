package module10.lesson1

class DiskPhone : Callable {
    override val vendor = "Tesla"
    override fun call(number: String) {
        println("Disk phone calling $number")
    }
}