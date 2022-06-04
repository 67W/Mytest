package module11.practice

import kotlin.random.Random

abstract class AbstractWeapon(
    val maxAmmoCount: Int,
    val fireType: FireType
) {

    private val ammoMagazine = GenericStack<Ammo>()
   var isEmptyMagazine: Boolean = false
   get() = ammoMagazine.isEmpty()

    fun createAmmoType(ammo: Int): Ammo {
        return when (ammo) {
            1 -> Ammo.AMMO10
            2 -> Ammo.AMMO12
            else -> Ammo.AMMO16
        }
    }

    fun reloadMagazine() {
        val getRandom = Random.nextInt(1,4)
        repeat(maxAmmoCount) {
            ammoMagazine.push(createAmmoType(getRandom))
        }
    }

    fun getAmmo(): Ammo? {
        val pop = ammoMagazine.pop()
        println(pop)
        println(ammoMagazine.toString())
        return pop
    }
}