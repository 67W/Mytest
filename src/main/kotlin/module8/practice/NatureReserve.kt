package module8.practice

import kotlin.random.Random

class NatureReserve {

    private val animalList = mutableListOf<Animal>()

    init {
        animalList.add(Bird(15, 1, 1, name = "SUPER BIRD 1"))
        animalList.add(Bird(15, 1, 1, name = "SUPER BIRD 2"))
        animalList.add(Bird(15, 1, 1, name = "SUPER BIRD 3"))
        animalList.add(Bird(15, 1, 1, name = "SUPER BIRD 4"))
        animalList.add(Bird(15, 1, 1, name = "SUPER BIRD 5"))
        animalList.add(Fish(10, 5, 1, name = "SUPER FISH 1"))
        animalList.add(Fish(3, 3, 2, name = "SUPER FISH 1"))
        animalList.add(Fish(15, 1, 1, name = "SUPER FISH 1"))
        animalList.add(Dog(15, 1, 1, name = "SUPER DOG 1"))
        animalList.add(Dog(15, 1, 1, name = "SUPER DOG 1"))
        animalList.add(Animal(1, 2, 3, 4, "SUPER ANIMAL"))
    }

    fun animalList() {
        val animalList = NatureReserve().animalList
        repeat(20) {
            for (i in animalList.indices) {
                val animal = animalList.getOrNull(i) ?: continue
                when (Random.nextInt(1, 5)) {
                    1 -> animal.move()
                    2 -> animal.eat()
                    3 -> animal.sleep()
                    4 -> checkAnimal(animal, animalList)
                }
                println("Количество животных: ${animalList.size}")
                if (animal.isTooOld()) {
                    animalList.remove(animal)
                }
                if (animalList.isEmpty()) {
                    println("List empty")
                    return
                }
            }
        }
    }

    private fun checkAnimal(animal: Animal, animalList: MutableList<Animal>) {
        when (animal) {
            is Fish -> animal.bornAnimal()
            is Bird -> animal.bornAnimal()
            is Dog -> animal.bornAnimal()
            else -> animal.bornAnimal()
        }
        animalList.add(animal)
    }
}
