package module11.practice

import kotlin.random.Random

abstract class AbstractWarrior(
    maxHP: Int,
    val accuracy: Int,
    val weapon: AbstractWeapon
) : Warrior {

    private var currentHP = maxHP
    override val avoidChance = Random.nextInt(0, 1)

    override var isKilled = false

    override fun attack(enemy: Warrior) {
        println(weapon.toString())
        if (weapon.isEmptyMagazine) {
            weapon.reloadMagazine()
            println("weapon.reloadMagazine()")
        } else {
            println("12314")
            if (weapon.fireType is FireType.Oneshot) {
                val ammo = weapon.getAmmo()
                if (ammo != null && accuracy >= enemy.avoidChance) {
                    println(ammo.damage())
                    enemy.getDamage(ammo.damage())
                }
            } else if (weapon.fireType is FireType.BurstFire) {
                println("KJNDSFJN")
                val queue = weapon.fireType.size

                repeat(queue) {
                    val ammo = weapon.getAmmo() ?: return
                    if (accuracy >= enemy.avoidChance) {
                        println(ammo.damage())
                        enemy.getDamage(ammo.damage())
                    }
                }
            }
        }
    }

    override fun getDamage(countDamage: Int) {
        currentHP -= countDamage
        if (currentHP < 0) {
            isKilled = true
        }
    }
}