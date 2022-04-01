package module7.practice

class TVClass(val brand: String, val model: String, val diagonalSize: String) {

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

    private var currentList = listOf<String>()

    init {
        currentList = Channels.getRandomChannels(nameList)
    }

    private val currentChannel = 0

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
        return currentList.getOrNull(input - 1) ?: "wrong channel"
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