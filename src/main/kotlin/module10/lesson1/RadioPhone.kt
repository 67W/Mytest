package module10.lesson1

class RadioPhone : Callable {
    override val vendor = "Panasonic"
    override fun call(number: String) {
        println("Radio phone calling $number")
    }
}