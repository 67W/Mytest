package module11.practice

import kotlin.random.Random

abstract class AbstractWarrior(
    maxHP: Int,
    val accuracy: Int,
    val weapon: AbstractWeapon
) : Warrior {

    private var currentHP = maxHP
    override val avoidChance = Random.nextInt(0, 101)

    override var isKilled = false

    override fun attack(enemy: Warrior) {
        if (isKilled) return

        if (weapon.isEmptyMagazine) {
            weapon.reloadMagazine()
        } else {
            if (weapon.fireType is FireType.Oneshot) {
                val ammo = weapon.getAmmo()
                if (ammo != null && accuracy >= enemy.avoidChance) {
                    enemy.getDamage(ammo.damage())
                }
            } else if (weapon.fireType is FireType.BurstFire) {
                val queue = weapon.fireType.size

                repeat(queue) {
                    val ammo = weapon.getAmmo() ?: return
                    if (accuracy >= enemy.avoidChance) {
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