package module8.practice

open class Fish(
    energy: Int,
    weight: Int,
    currentAge: Int,
    maxAge: Int = 2,
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
        println("Плывет")
    }

    override fun bornAnimal(): Fish {
        val animal = super.bornAnimal()
        return Fish(
            energy = animal.energy,
            weight = animal.weight,
            currentAge = animal.currentAge,
            name = animal.name,
            maxAge = animal.maxAge
        )
    }
}