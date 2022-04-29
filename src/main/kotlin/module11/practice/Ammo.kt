package module11.practice

import kotlin.random.Random
import kotlin.random.nextInt

enum class Ammo(
    val standardDamage: Int,
    val criticalDamageChance: Int,
    val criticalDamageRatio: Int
) {
    AMMO10(10, 30, 50),
    AMMO12(12, 20, 70),
    AMMO16(16, 10, 160);

    fun damage(): Int {
        return if (criticalDamageChance.randomCriticalDamageChance()) {
            criticalDamageRatio * standardDamage
        } else {
            standardDamage
        }
    }
}

fun Int.randomCriticalDamageChance(): Boolean {
    val random = Random.nextInt(0, 100)
    println(random)
    return this <= random
}

fun randomD(damage: Int) = damage <= Random.nextInt(0, 100)
fun Int.randomD1() = this <= Random.nextInt(0, 100)
