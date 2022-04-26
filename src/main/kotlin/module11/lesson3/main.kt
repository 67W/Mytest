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

fun switchColor(color: SealedColor): SealedColor =
    when (color) {
        SealedColor.White -> SealedColor.Black
        SealedColor.Black -> SealedColor.Red
        SealedColor.Red -> SealedColor.Green
        SealedColor.Green -> SealedColor.Blue
        SealedColor.Blue -> SealedColor.Black
        is SealedColor.CustomColor -> SealedColor.CustomColor("#345")
    }