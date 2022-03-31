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

    var volume = 0

    fun volumeUp(inputVolume: Int): String {
        return when {
            inputVolume < 0 -> "Min volume 0"
            inputVolume > maxVolume -> "Max volume: $maxVolume"
            else -> {
                volume += inputVolume
                volume.toString()
            }
        }
    }

    fun volumeDown(inputVolume: Int): String {
        return when {
            inputVolume < 0 -> "Min volume 0"
            inputVolume > maxVolume -> "Max volume: $maxVolume"
            else -> {
                volume -= inputVolume
                volume.toString()
            }
        }
    }

    fun changeChannel(input: Int): String {
        if (turnOnTV == false) {
            turnOnTV()
        }
        return nameList.getOrNull(input - 1) ?: "wrong channel"
    }

    fun channelInput(input: Int): String {
        return when (input) {
            input -> "${Channels.mutMap.get(key = input)}"
            else -> "no channelInput"
        }
    }


    companion object {
        const val maxVolume = 100
    }
}