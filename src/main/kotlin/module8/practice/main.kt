package module8.practice

import kotlin.random.Random

fun main() {
    println("hi")
    //    val bird = Bird(10, 1, 0, 15, "BIRD")
    //    val fish = Fish(3, 0, 5, "FISH")
    //    bird.sleep()
    //    println(bird.energy)
    //    bird.eat()
    //    println(bird.currentAge)
    //    bird.eat()
    //    println(bird.currentAge)
    //    bird.move()
    //    println(bird.currentAge)

    //    fish.bornAnimal()
    val fish = Fish(20, 20, 1, name = "FISH")
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

    dog.move()
    dog.bornAnimal()

    bird.move()
    bird.bornAnimal()

    val animalList = NatureReserve().animalList
    for (i in animalList.indices) {
        when (Random.nextInt(1, 2)) {

            1 -> {

                animalList.add(animalList[i].bornAnimal())
            }
        }
        println(animalList)


    }

}


// пригодится
//    when((1..5).random()){
//        1->animalList[i].sleep()
//        2->animalList[i].eat()
//        3->animalList[i].move()
//        4->{
//            animalBorn++
//            animalList.add(animalList[i].bornAnimal())
//        }
//    }
