package module8.practice

class Bird(
    energy: Int,
    weight: Int,
    currentAge: Int,
    maxAge: Int = 5,
    name: String
) : Animal(
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

    public override fun bornAnimal(): Animal {
        return super.bornAnimal()
    }
}