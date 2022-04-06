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
        if (isNotOkStatus()) return
        super.move()
        println("Бежит")
    }

    override fun bornAnimal(): Dog {
        val animal = super.bornAnimal()
        return Dog(
            energy = animal.energy,
            weight = animal.weight,
            currentAge = animal.currentAge,
            name = animal.name,
            maxAge = animal.maxAge
        )
    }
}