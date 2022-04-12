package module9.practice

class DebitCard2(balance: Int) : DebitCard(balance = balance) {
    private val potentialCashback = 0.05
    private var countBonus: Double = 0.0
    private val min = 5000

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
            result * potentialCashback
        } else {
            0.0
        }
        return result
    }
}