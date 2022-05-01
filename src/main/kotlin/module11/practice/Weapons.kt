package module11.practice

object Weapons {

    fun createPistol() = object : AbstractWeapon(15, FireType.Oneshot) {}

    fun createRifle() = object : AbstractWeapon(30, FireType.BurstFire(5)) {}

    fun createShotgun() = object : AbstractWeapon(5, FireType.Oneshot) {}

    fun createHeavygun() = object : AbstractWeapon(100, FireType.BurstFire(30)) {}
}


