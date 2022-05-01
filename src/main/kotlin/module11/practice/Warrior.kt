package module11.practice

interface Warrior {
    var isKilled: Boolean
    val avoidChance: Int

    fun attack(enemy: Warrior)
    fun getDamage(countDamage: Int)
}