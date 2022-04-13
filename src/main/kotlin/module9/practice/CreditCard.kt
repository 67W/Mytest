package module9.practice

open class CreditCard(balance: Int) : BankCard(balance) {
    private val creditLimit = 100000
    private var creditBalance = creditLimit

    override fun deposit(cashIn: Int) {
        creditBalance += cashIn
        if (creditBalance > creditLimit) {
            balance += creditBalance - creditLimit
            creditBalance = creditLimit
        }
    }

    override fun pay(cashOut: Int): Boolean {
        return if (creditBalance + balance >= cashOut) {
            if (balance <= cashOut) {
                creditBalance -= cashOut - balance
                balance = 0
            } else {
                balance -= cashOut
            }
            true
        } else {
            println("No money")
            false
        }
    }

    override fun getBalanceInfo(): Int {
        println("Credit card balance: $creditBalance")
        println("Main balance:$balance")
        return balance
    }
}