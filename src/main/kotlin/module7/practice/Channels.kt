package module7.practice

import kotlin.random.Random

object Channels {

    fun getRandomChannels(nameList: MutableList<String>): MutableList<String> {
        val countChannel = Random.nextInt(2, 10)
        val mutList = mutableListOf<String>()
        for (i in 1..countChannel) {
            mutList += nameList[i]
        }
        return mutList
    }
}