package module9.practice

class DebitCard2(balance: Int) : DebitCard(balance = balance) {
    private val potentialBonus = 0.05
    private var countBonus: Double = 0.0
    private val min = 5000


    // Потенциальный бонус 5% от покупок при условии трат больше 5 000 тыс.
    override fun pay(cashOut: Int): Boolean {
        val sumPay = if (cashOut < countBonus) {
            countBonus -= cashOut
            countBonus
        } else {
            result(cashOut)
        }
        return super.pay(sumPay.toInt())
    }

    private fun result(cashOut: Int): Double {
        val result = cashOut - countBonus
        countBonus = if (result > min) {
            result * potentialBonus
        } else {
            0.0
        }
        return result
    }

    override fun getBalanceInfo(): Int {
        println("Debit card percentage: $potentialBonus")
        println("Debit card minimal cashout: $min")
        return super.getBalanceInfo()
    }

    fun printInfo() = println("Count bonus: $countBonus")
}