package module8.practice

import kotlin.random.Random

open class Animal(
    var energy: Int,
    var weight: Int,
    var currentAge: Int,
    val maxAge: Int,
    val name: String
) {
    open fun isTooOld() = when {
        currentAge >= maxAge -> true
        else -> false
    }

    open fun sleep() {
        energy += 5
        println("$name спит")
    }

    open fun eat() {
        energy += 3
        weight += 1
        if (Random.nextBoolean()) {
            currentAge += 1
        }
        println("$name ест")
    }

    open fun move() {
        energy -= 5
        weight -= 1
        if (Random.nextBoolean()) {
            currentAge += 1
        }
        println("$name двигается")
    }
}