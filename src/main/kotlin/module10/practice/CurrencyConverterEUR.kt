package module10.practice

class CurrencyConverterEUR : CurrencyConverter {
    override val currencyCode = EUR

    override val course = 120

    override fun convertToRub(currency: Int): Int {
        val result = currency * course
        println("$result рублей = $currency %$currencyCode%")
        return result
    }
}