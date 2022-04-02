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
}