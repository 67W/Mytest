package module8.practice

class Bird(energy: Int, weight: Int, currentAge: Int, maxAge: Int, name: String) : Animal(
    energy,
    weight,
    currentAge,
    maxAge,
    name
) {
    override fun move() {
        super.move()
        println("Летит")
    }
}