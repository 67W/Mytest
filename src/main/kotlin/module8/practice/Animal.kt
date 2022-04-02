package module8.practice

open class Animal(
    val energy: Int,
    val weight: Int,
    val currentAge: Int,
    val maxAge: Int,
    val name: String
) {
    open fun isTooOld() = when {
        currentAge >= maxAge -> true
        else -> false
    }

    open fun sleep() = println("sleeping")
    open fun eat() = println("eating")
    open fun move() = println("moving")
}