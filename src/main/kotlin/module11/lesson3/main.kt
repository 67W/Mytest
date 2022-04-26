package module11.lesson3

fun main() {
    Color.values().forEach {
        println("${it.name} - ${it.ordinal}")
    }
}

fun switchColor(color: Color): Color =
    when (color) {
        Color.WHITE -> Color.BLACK
        Color.BLACK -> Color.RED
        Color.RED -> Color.GREEN
        Color.GREEN -> Color.BLUE
        Color.BLUE -> Color.BLACK
    }