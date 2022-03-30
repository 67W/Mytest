package module7.lesson4

object EiffelTower {
    var backlightsOn = false
    val height = 324
    fun turnOnBacklights() {
        println("Backlights ON")
        backlightsOn = true
    }

    fun turnOffBacklights() {
        println("Backlights OFF")
        backlightsOn = false
    }
}