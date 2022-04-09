package module9.practice

abstract class BankCard(var balance: Int) {

    //    abstract val balance: Int
    open fun deposit(cashIn: Int) {
        balance += cashIn
    }

    open fun pay(cashOut: Int): Boolean {
        return if (balance < cashOut) {
            false
        } else {
            balance -= cashOut
            true
        }
    }

    open fun getBalanceInfo() = balance

    fun getFreeBalanceInfo() {}
}