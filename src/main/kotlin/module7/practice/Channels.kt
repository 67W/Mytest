package module7.practice

import kotlin.random.Random

object Channels {
    val countChannel = Random.nextInt(1, 10)
    private val list = mutableListOf<Int>()
    fun listChannels(input: Int): MutableList<Int> {
        for (i in 1..input) {
            list += i
        }
        return list
    }
    var mutMap = mutableMapOf<Int, String>()
    private set

    val nameList = ClassChannel().nameList
    fun getRandomChannels(): MutableMap<Int, String> {

        for (i in list.indices) {
            mutMap += Pair(list[i], nameList.shuffled()[i])
        }
        return mutMap
    }
}