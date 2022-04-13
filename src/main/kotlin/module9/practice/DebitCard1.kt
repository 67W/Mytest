package module9.practice

class DebitCard1(balance: Int) : DebitCard(balance = balance) {
    private val percentage = 0.01
    private var countBonus: Double = 0.0

    override fun pay(cashOut: Int): Boolean {
        val sumPay = if (cashOut < countBonus) {
            countBonus -= cashOut
            countBonus
        } else {
            val result = cashOut - countBonus
            countBonus = result * percentage
            result
        }
        return super.pay(sumPay.toInt())
    }

    override fun getBalanceInfo(): Int {
        println("Debit card percentage: $percentage")
        return super.getBalanceInfo()
    }

    fun printInfo() = println("Count bonus: $countBonus")
}