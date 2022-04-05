package module8.practice

class Dog(
    energy: Int,
    weight: Int,
    currentAge: Int,
    maxAge: Int = 10,
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
        println("Бежит")
    }

    public override fun bornAnimal(): Animal {
        return super.bornAnimal()
    }
}