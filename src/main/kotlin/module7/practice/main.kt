package module7.practice

fun main() {
    val lg = TVClass("lg", "a123", "51")

    lg.turnOnTV()
    lg.turnOffTV()
    lg.turnOnTV()

    println("Max volume: ${TVClass.maxVolume}")
    println("Set volume:")
    val setVolume = TVClass.volume(readLine()!!.toInt())
    println("Now is $setVolume")

    val listChan = Channels.listChannels(Channels.countChannel)
    println(listChan)

    println(Channels.nameList)
    println(Channels.getRandomChannels())

    println("Input channelInput:")
    val channel = readLine()!!.toInt()
    println(lg.channelInput(channel))
}