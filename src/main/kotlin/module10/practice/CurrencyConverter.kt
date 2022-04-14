package module10.practice

interface CurrencyConverter {
    val currencyCode: String
    val course: Int

    fun convertToRub(currency: Int): Int
}