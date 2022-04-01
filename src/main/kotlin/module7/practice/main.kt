package module7.practice

fun main() {
    val lg = TVClass("lg", "a123", "51")
    val samsung = TVClass("samsung", "a98", "100")

    println(samsung.toString())
    println(lg.toString())

    lg.turnOnTV()
    lg.turnOffTV()

//    println("Max volume: ${TVClass.maxVolume}")
//    println("Now volume is: ${lg.volume}")
//
//    println("Up volume by:")
//    lg.volumeUp(readLine()!!.toInt())
//    println("Now volume is: ${lg.volume}")
//
//    println("Проверка значения громкости ${lg.volume}")
//
//    println("Down volume by:")
//    lg.volumeDown(readLine()!!.toInt())
//    println("Now volume is: ${lg.volume}")
//
//    println("Проверка значения громкости ${lg.volume}")

    println("Input channelInput:")
    val channel = readLine()!!.toInt()
    println("Вывод из changeChannel")
    println(lg.changeChannel(channel))

    println("Input channelInput:")
    val channelX = readLine()!!.toString()
    println("Вывод из changeChannel")
    println(lg.xChangeChannel(channelX))

    lg.printAllChannels()


}