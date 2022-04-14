package module10.lesson1

class MobilePhone: Callable, WebBrowser {
    override fun call(number: String) {
        println("Mobile phone calling $number")
    }

    override fun playVideo(url: String) {
        println("Mobile phone playing video from $url")
    }
}