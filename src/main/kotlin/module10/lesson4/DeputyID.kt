package module10.lesson4

class DeputyID(
    private val number: String,
    private val issueDate: String

) : Document {
    override fun getStringIdentifier(): String = "$number, issue date: $issueDate"

    override fun getTypeDocument(): String = "Deputy ID"
}