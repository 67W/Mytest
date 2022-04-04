package module8.practice

fun main() {
    println("hi")
    val bird = Bird(10, 1, 0, 15, "BIRD")
    bird.sleep()
    println(bird.energy)
    bird.eat()
    println(bird.currentAge)
    bird.eat()
    println(bird.currentAge)
    bird.move()
    println(bird.currentAge)
//listOf<>()
//    list.add()
    val newAnimal = bird.bornAnimal()
    println(
        "Born new animal: Name: ${newAnimal.name}, " +
                "Age: ${newAnimal.currentAge}, " +
                "Weight: ${newAnimal.weight}, " +
                "Energy: ${newAnimal.energy}, " +
                "Max age: ${newAnimal.maxAge}"
    )

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
}