package module8.practice

open class NatureReserve {
    open val animalList = mutableListOf<Animal>()

    init {
        animalList.add(Fish(10, 5, 1, name = "F"))
        animalList.add(Fish(3, 3, 2, name = "F"))
        animalList.add(Fish(15, 1, 1, name = "F"))
    }
}