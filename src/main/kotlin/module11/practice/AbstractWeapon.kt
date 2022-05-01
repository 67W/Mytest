package module11.practice

import kotlin.random.Random

abstract class AbstractWeapon(
    val maxAmmoCount: Int,
    val fireType: FireType
) {

    var ammoMagazine = GenericStack<Ammo>()
    val isEmptyMagazine = ammoMagazine.isEmpty()

    fun createAmmoType(ammo: Int): Ammo {
        return when (ammo) {
            1 -> Ammo.AMMO10
            2 -> Ammo.AMMO12
            else -> Ammo.AMMO16
        }
    }

    fun reloadMagazine() {
        repeat(maxAmmoCount) {
            ammoMagazine.push(createAmmoType(Random.nextInt(1, 4)))
        }
    }

    fun getAmmo(): Ammo? {
        return ammoMagazine.pop()
    }
}