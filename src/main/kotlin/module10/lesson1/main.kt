package module10.lesson1

fun main() {
    val devices = listOf(MobilePhone(), AppleWatch(), DiskPhone(), SmartFridge())
    devices.forEach { it.call("89219999999") }
}