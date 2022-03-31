package module7.practice

fun main() {
    val lg = TVClass("lg", "a123", "51")

    lg.turnOnTV()
    lg.turnOffTV()
    lg.turnOnTV()

    println("Max volume: ${TVClass.maxVolume}")
    println("Set volume:")

    val lgSetVolumeUp = lg.volumeUp(readLine()!!.toInt())
    println("Now is $lgSetVolumeUp")

    println("Set volume:")
    val lgSetVolumeDown = lg.volumeDown(readLine()!!.toInt())
    println("Now is $lgSetVolumeDown")

    val listChan = Channels.listChannels(Channels.countChannel)
    println(listChan)

//    println(Channels.nameList)
    println(Channels.getRandomChannels())

    println("Input channelInput:")
    val channel = readLine()!!.toInt()
    println(lg.channelInput(channel))
}
//        0 Меню
//        1 вкл выкл
//        0
//        2 громкость
//        0
//        3 каналы
//        0
//        4
//        5