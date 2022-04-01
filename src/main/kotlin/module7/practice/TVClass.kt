package module7.practice

data class TVClass(val brand: String, val model: String, val diagonalSize: String) {

    private val nameList = mutableListOf(
        "BBC One",
        "BBC Two",
        "BBC Scotland",
        "BBC Three",
        "BBC Four",
        "Discovery",
        "Animal Planet",
        "BBC News",
        "BBC Parliament",
        "TLC",
        "Channel 4",
        "Channel 5",
        "MTV",
        "Nickelodeon",
        "Comedy Central",
        "Eurosport 1",
        "National Geographic"
    )

    private var currentList = mutableListOf<String>()

    init {
        currentList = Channels.getRandomChannels(nameList)
        println(currentList)
    }

    private var currentChannelIndex = "0"

    var turnOnTV = false
        private set

    fun turnOnTV() {
        println("TV ON")
        turnOnTV = true
    }

    fun turnOffTV() {
        println("TV OFF")
        turnOnTV = false
    }

    var volume = 50

    fun volumeUp(inputVolume: Int): Int {
        if (!turnOnTV) {
            return -1
        }
        return when {
            inputVolume < 0 -> volume
            volume + inputVolume > maxVolume -> {
                volume = maxVolume
                volume
            }
            else -> {
                volume += inputVolume
                volume
            }
        }
    }

    fun volumeDown(inputVolume: Int): Int {
        if (!turnOnTV) {
            return -1
        }
        return when {
            inputVolume > 0 -> volume
            volume + inputVolume < 0 -> {
                volume = 0
                volume
            }
            else -> {
                volume += inputVolume
                volume
            }
        }
    }

    fun changeChannel(input: Int): String {
        if (turnOnTV == false) {
            turnOnTV()
        }
        currentChannelIndex = (input - 1).toString()
        return currentList.getOrNull(input - 1) ?: "0"
    }

    fun xChangeChannel(input: String): String {
        if (turnOnTV == false) {
            turnOnTV()
        }

        when (input) {
            "+" -> {
                if (currentChannelIndex.toInt() + 1 >= currentList.size) {
                    currentChannelIndex = "0"
                } else {
                    currentChannelIndex = (currentChannelIndex.toInt() + 1).toString()
                }
            }
            "-" -> {
                if (currentChannelIndex.toInt() - 1 < 0) {
                    currentChannelIndex = currentList.lastIndex.toString()
                } else {
                    currentChannelIndex = (currentChannelIndex.toInt() - 1).toString()
                }
            }
        }

        return currentList.getOrNull(currentChannelIndex.toInt()) ?: "wrong channel"
    }

    fun printAllChannels() {
        for (i in 0 until currentList.size)
            println("${i + 1} - ${currentList[i]}")
    }

// возможно не понадобится
//    fun channelInput(input: Int): String {
//        return when (input) {
//            input -> "${Channels.mutMap.get(key = input)}"
//            else -> "no channelInput"
//        }
//    }


    companion object {
        const val maxVolume = 100
    }
}