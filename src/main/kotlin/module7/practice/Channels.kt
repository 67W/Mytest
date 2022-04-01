package module7.practice

import kotlin.random.Random

object Channels {

    private val list = mutableListOf<Int>()
    fun listChannels(input: Int): MutableList<Int> {
        for (i in 1..input) {
            list += i
        }
        return list
    }

    fun getRandomChannels(nameList: MutableList<String>): MutableList<String> {
        val countChannel = Random.nextInt(1, 10)
        val mutList = mutableListOf<String>()
        nameList.shuffled()
        for (i in 1..countChannel) {
            mutList += nameList[i]
        }
        return mutList
    }
}