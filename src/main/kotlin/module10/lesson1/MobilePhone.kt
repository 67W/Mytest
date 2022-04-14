package module10.lesson1

class MobilePhone : CallReceiver, WebBrowser {
    override val vendor = "Samsung"
    override fun call(number: String) {
        println("Mobile phone calling $number")
    }

    override fun receiveCall(number: String) {
        super.receiveCall(number)
        println("LED on")
    }

    override fun playVideo(url: String) {
        println("Mobile phone playing video from $url")
    }
}