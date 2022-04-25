package module9.lesson2

class Boeing737 : Aircraft(10000) {
    override val brand: String = "Boeing"
    override val model: String = "737"
    override val engineCount: Int = 2
    override val altitude: Int = 12500
    override val rows: Int = 40
    override val numberOfSeatsInARow: Int = 6


    override fun getSeatScheme() {
        println("   ABC   DEF")
        seatScheme.forEachIndexed { rowIndex, row ->
            println("${rowIndex + 1} ")
            row.forEachIndexed { seatIndex, passenger ->
                if (passenger == null) {
                    println('_')
                } else {
                    println('x')
                }
                if (seatIndex == row.lastIndex / 2) {
                    println("  ")
                }
                println()
                if (rowIndex != 0 && rowIndex % 10 == 0) {
                    println()
                }
            }
        }
    }

    override val capacity: Int = rows * numberOfSeatsInARow
}