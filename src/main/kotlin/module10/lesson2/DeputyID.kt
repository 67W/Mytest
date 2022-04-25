package module10.lesson2

class DeputyID(
    private val number: String
) : Document {
    override fun getStringIdentifier(): String = number

    override fun getTypeDocument(): String = "Deputy ID"
}