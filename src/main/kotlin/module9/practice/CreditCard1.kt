package module9.practice

class CreditCard1(balance: Int) : CreditCard(balance = balance) {
    private var potentialCashback = 0.05
    private var cashbackMax = 0.1
    private var cashback: Double = 0.0
    private var sumPay = 0
    private val cashForCashbackLevelUp = 50000

    override fun pay(cashOut: Int): Boolean {
        sumPay = sumPay + cashOut
        if (sumPay > cashForCashbackLevelUp && potentialCashback < cashbackMax) {
            potentialCashback += 0.01
            sumPay
        }
        return super.pay(sumPay.toInt())
    }

    private fun result(cashOut: Int): Double {
        val result = cashOut - cashback
        cashback = if (result > sumPay) {
            result * potentialCashback
        } else {
            0.0
        }
        return result
    }
}


// каждые 50к покупки +1% кэшбэк до 10% кэшбэк