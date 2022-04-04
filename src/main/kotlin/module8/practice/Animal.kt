package module8.practice

import kotlin.random.Random

open class Animal(
    var energy: Int, var weight: Int, var currentAge: Int, val maxAge: Int, val name: String
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
        tryIncrementAge()
        println("$name ест")
    }

    open fun move() {
        energy -= 5
        weight -= 1
        tryIncrementAge()
        println("$name двигается")
    }

    fun tryIncrementAge() {
        if (energy <= 0 || weight <= 0 || isTooOld()) return

        if (Random.nextBoolean()) {
            currentAge += 1
        }
    }
// не отрабатывает на принт показателей рожденного животного. принтит покахатели родителя bird or fish, or any
//    fun bornAnimal(): Animal {
//        println("Name $name, energy: $energy")
//        return Animal(
//            energy = Random.nextInt(1, 10),
//            weight = Random.nextInt(1, 5),
//            name = name,
//            maxAge = maxAge,
//            currentAge = 0
//        )
//    }

    fun bornAnimal(): Animal {
        val bornNewAnimal = Animal(
            energy = Random.nextInt(1, 10), weight = Random.nextInt(1, 5), name = name, maxAge = maxAge, currentAge = 0
        )
        println(
            "New animal was born. Name: ${bornNewAnimal.name}, energy: ${bornNewAnimal.energy}, weight: ${bornNewAnimal.weight}, current age: ${bornNewAnimal.currentAge}, max age: ${bornNewAnimal.maxAge}"
        )
        return bornNewAnimal
    }
}