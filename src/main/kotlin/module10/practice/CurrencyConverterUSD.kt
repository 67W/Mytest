package module10.practice

class CurrencyConverterUSD : CurrencyConverter {
    override val currencyCode = USD

    override val course = 100

    override fun convertToRub(currency: Int): Int {
        val result = currency * course
        println("$result рублей = $currency %$currencyCode%")
        return result
    }
}