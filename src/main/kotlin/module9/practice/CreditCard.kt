package module9.practice

class CreditCard(balance: Int) : BankCard(balance) {
    val creditLimit = 10000
    var creditBalance = creditLimit

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
        } else false
    }

    override fun getBalanceInfo(): Int {
        println("Credit card balance: $creditBalance")
        println("Main balance:$balance")
        return balance
    }
}