package module10.lesson1

fun main() {
    val devices = listOf(MobilePhone(), AppleWatch(), DiskPhone(), SmartFridge())
    devices.forEach { it.call("89219999999") }

    val mobilePhone = MobilePhone()
    mobilePhone.call("98745645656")
    mobilePhone.playVideo("www.example.com")
}