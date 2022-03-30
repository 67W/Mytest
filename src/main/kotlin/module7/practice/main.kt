package module7.practice

fun main() {
    val lg = TVClass("lg", "a123", "51")

    lg.turnOnTV()
    lg.turnOffTV()
    lg.turnOnTV()
    println("Input channelInput:")
    val channel = readLine()!!.toInt()
    println(lg.channelInput(channel))

    println("MY ${lg.turnOnTV}")

    println("Max volume: ${TVClass.maxVolume}")
    val setVolume = TVClass.volume(readLine()!!.toInt())
    println("Now is $setVolume")
}