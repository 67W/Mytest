package module11.practice

import kotlin.random.Random

class Team {
    fun createTeam(): List<AbstractWarrior> {
        val team = mutableListOf<AbstractWarrior>()
        repeat(10) {
            val random = Random.nextInt(0, 101)
            val random2 = Random.nextInt(0, 101)
            when {
                random < 10 -> team.add(General(weapon = Weapons.createHeavygun()))
                random2 < 40 -> team.add(Captain(weapon = Weapons.createPistol()))
                else -> team.add(Soldier(weapon = Weapons.createRifle()))
            }
        }
        return team
    }
}