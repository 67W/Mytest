package module7.practice

fun main() {
    val lg = TVClass("LG", "A123", "51")
    val samsung = TVClass("SAMSUNG", "B98", "100")

    println(lg.toString())

    lg.turnOnTV()
    lg.turnOffTV()

    lg.printAllChannels()
    println("Input number of channel:")
    var channel = readLine()!!.toInt()
    println("Output channel:")
    println(lg.changeChannel(channel))

    println("Input '+' or '-' button:")
    var channelX = readLine()!!.toString()
    println("Output channel:")
    println(lg.xChangeChannel(channelX))


    println("Max volume: ${TVClass.maxVolume}")
    repeat(3) {
        println("Now volume is: ${lg.volume}")

        println("Up (type 'number') volume by:")
        lg.volumeUp(readLine()!!.toInt())
        println("Now volume is: ${lg.volume}")

        println("Проверка значения громкости ${lg.volume}")

        println("Down (type '-number') volume by:")
        lg.volumeDown(readLine()!!.toInt())
        println("Now volume is: ${lg.volume}")

        println("Проверка значения громкости ${lg.volume}")
    }

    println(samsung.toString())

    samsung.turnOnTV()
    samsung.turnOffTV()

    samsung.printAllChannels()
    println("Input number of channel:")
    repeat(5) {
        channel = readLine()!!.toInt()
        println("Output channel:")
        println(samsung.changeChannel(channel))
    }

    repeat(5) {
        println("Input '+' or '-' button:")
        channelX = readLine()!!.toString()
        println("Output channel:")
        println(samsung.xChangeChannel(channelX))
    }
}