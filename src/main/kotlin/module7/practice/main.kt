package module7.practice

fun main() {
    val lg = TVClass("lg", "a123", "51")

    lg.turnOnTV()
    lg.turnOffTV()

    println("Max volume: ${TVClass.maxVolume}")
    println("Now volume is: ${lg.volume}")

    println("Up volume by:")
    lg.volumeUp(readLine()!!.toInt())
    println("Now volume is: ${lg.volume}")

    println("Проверка значения громкости ${lg.volume}")

    println("Down volume by:")
    lg.volumeDown(readLine()!!.toInt())
    println("Now volume is: ${lg.volume}")

    println("Проверка значения громкости ${lg.volume}")

    println("Input channelInput:")
    val channel = readLine()!!.toInt()
    println("Вывод из changeChannel")
    println(lg.changeChannel(channel))
}