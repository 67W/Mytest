package module10.lesson1

class MobilePhone: Callable {
    override fun call(number: String) {
        println("Mobile phone calling $number")
    }
}