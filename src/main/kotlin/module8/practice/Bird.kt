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
        if (isNotOkStatus()) return
        super.move()
        println("Летит")
    }

    override fun bornAnimal(): Bird {
        val animal = super.bornAnimal()
        return Bird(
            energy = animal.energy,
            weight = animal.weight,
            currentAge = animal.currentAge,
            name = animal.name,
            maxAge = animal.maxAge
        )
    }
}