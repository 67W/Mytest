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

    fun getRandomChannels(nameList: MutableList<String>): MutableList<String> {
        val mutList = mutableListOf<String>()
        for (i in list.indices) {
            mutList += nameList.shuffled()[i]
        }
        return mutList
    }
}