package module8.practice

import kotlin.random.Random

open class NatureReserve {
    open val animalList = mutableListOf<Animal>()

    init {
        animalList.add(Bird(15, 1, 1, name = "BIRD 1"))
        animalList.add(Bird(15, 1, 1, name = "BIRD 2"))
//        animalList.add(Bird(15, 1, 1, name = "F"))
//        animalList.add(Bird(15, 1, 1, name = "F"))
//        animalList.add(Bird(15, 1, 1, name = "F"))
//        animalList.add(Fish(10, 5, 1, name = "F"))
//        animalList.add(Fish(3, 3, 2, name = "F"))
//        animalList.add(Fish(15, 1, 1, name = "F"))
//        animalList.add(Dog(15, 1, 1, name = "F"))
//        animalList.add(Dog(15, 1, 1, name = "F"))
//        animalList.add(Animal(1, 2, 3, 4, "Animal"))
    }


    fun animalList() {
        val animalList = NatureReserve().animalList
        repeat(10) {
            for (i in animalList.indices) {
                val animal = animalList.getOrNull(i) ?: return@
                when (Random.nextInt(1, 3)) {
                    1 -> animal.move()
                    2 -> animal.eat()
                    3 -> animal.sleep()
                    4 -> checkAnimal(animal, animalList)
                }
                println(animalList)
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


