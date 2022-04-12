package module9.practice

abstract class DebitCard(balance: Int) : BankCard(balance) {

//    override open fun deposit(cashIn: Int) {
//        super.deposit(cashIn)
//    }

    override fun getBalanceInfo(): Int {
        println("Debit card balance: $balance")
        return balance
    }
}