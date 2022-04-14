package module10.practice

fun main() {
    val usd = Converters.get(USD)
    val eur = Converters.get(EUR)
    val unknownCurrency = Converters.get("зимбабвийский доллар")

    val codeUSD = usd.currencyCode
    val codeEUR = eur.currencyCode
    val unknownCode = unknownCurrency.currencyCode

    println(codeUSD)
    println(codeEUR)
    println(unknownCode)

    println("----------")

    usd.convertToRub(100)
    eur.convertToRub(100)
    unknownCurrency.convertToRub(100)
}