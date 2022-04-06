package module8.practice

import kotlin.random.Random

fun main() {

    val fish = Fish(20, 20, 1, name = "FISH", maxAge = 30)
    val dog = Dog(10, 30, 1, name = "DOG")
    val bird = Bird(30, 10, 1, name = "BIRD")

    fish.move()
    println(fish.energy)
    fish.move()
    println(fish.energy)
    fish.move()
    println(fish.energy)
    fish.move()
    println(fish.energy)
    fish.move()
    println(fish.energy)
    fish.bornAnimal()

    val naturalRev = NatureReserve()
    naturalRev.animalList()
}