package module8.practice

open class Fish(
    energy: Int,
    weight: Int,
    currentAge: Int,
    maxAge: Int = 3,
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
        println("Плывет")
    }

    public override fun bornAnimal(): Animal {
        return super.bornAnimal()
    }
}