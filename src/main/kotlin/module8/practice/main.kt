package module8.practice

fun main() {
    println("hi")
    val bird = Bird(10, 1, 0, 15, "BIRD")
    val fish = Fish(15, 3, 0, 5, "FISH")
    bird.sleep()
    println(bird.energy)
    bird.eat()
    println(bird.currentAge)
    bird.eat()
    println(bird.currentAge)
    bird.move()
    println(bird.currentAge)


//    val newBird = bird.bornAnimal()
//    println(
//        "Born new animal: Name: ${newBird.name}, " +
//                "Age: ${newBird.currentAge}, " +
//                "Weight: ${newBird.weight}, " +
//                "Energy: ${newBird.energy}, " +
//                "Max age: ${newBird.maxAge}"
//    )
//
//    val newFish = fish.bornAnimal()
//    println(
//        "Born new animal: Name: ${newFish.name}, " +
//                "Age: ${newFish.currentAge}, " +
//                "Weight: ${newFish.weight}, " +
//                "Energy: ${newFish.energy}, " +
//                "Max age: ${newFish.maxAge}"
//    )
    fish.bornAnimal()
}



// пригодится
//    when((1..5).random()){
//        1->animalList[i].sleep()
//        2->animalList[i].eat()
//        3->animalList[i].move()
//        4->{
//            animalBorn++
//            animalList.add(animalList[i].procreate())
//        }
//    }
