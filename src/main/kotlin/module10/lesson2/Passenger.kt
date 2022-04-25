package module10.lesson2

class Passenger(
    val name: String,
    val lastName: String,
    val document: Document,
    val seat: Seat
) {
    fun getInfo() = """$name with document: 
    |${document.getTypeDocument()} - ${document.getStringIdentifier()}
""".trimMargin()
}