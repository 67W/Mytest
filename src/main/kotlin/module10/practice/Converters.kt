package module10.practice

const val USD = "USD"
const val EUR = "EUR"

object Converters {
    private val CurrencyConverterUSD = CurrencyConverterUSD()
    private val CurrencyConverterEUR = CurrencyConverterEUR()

    fun get(currencyCode: String): CurrencyConverter {
        return when (currencyCode) {
            CurrencyConverterUSD.currencyCode -> CurrencyConverterUSD
            CurrencyConverterEUR.currencyCode -> CurrencyConverterEUR
            else -> object : CurrencyConverter {
                override val currencyCode = "what?"

                override val course = 1

                override fun convertToRub(currency: Int): Int {
                    val result = currency * course
                    println("$result рублей = $currency %$currencyCode%")
                    return result
                }
            }
        }
    }
}