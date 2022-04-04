package module8.practice

class Dog(energy: Int, weight: Int, currentAge: Int, maxAge: Int, name: String) : Animal(
    energy,
    weight,
    currentAge,
    maxAge,
    name
) {
    override fun move() {
        super.move()
        println("Бежит")
    }
}