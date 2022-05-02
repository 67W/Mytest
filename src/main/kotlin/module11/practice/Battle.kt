package module11.practice

import kotlin.random.Random

class Battle {
    private val firstTeam = Team().createTeam()
    private val secondTeam = Team().createTeam()
    val resultBattle = false

    fun getBattleInfo(): BattleState {
        return when {
            firstTeam.isEmpty() && secondTeam.isEmpty() -> BattleState.Draw
            firstTeam.isEmpty() -> BattleState.WinSecond
            secondTeam.isEmpty() -> BattleState.WinFirst
            else -> BattleState.Progress(firstTeam.size, secondTeam.size)
        }
    }

    fun battle() {
        firstTeam.shuffled()
        secondTeam.shuffled()
        attackTeam(firstTeam, secondTeam)
        attackTeam(secondTeam, firstTeam)
    }

    private fun attackTeam(firstTeam: MutableList<AbstractWarrior>, secondTeam: MutableList<AbstractWarrior>) {
        for (i in firstTeam.indices) {
           if( secondTeam.isEmpty()) return
            val second = secondTeam[Random.nextInt(0, secondTeam.size)]
            firstTeam[i].attack(second)
           // println(second.currentHP)
            if (second.isKilled) {
                println("killed")
                secondTeam.removeAt(i)
            }
        }
    }
}