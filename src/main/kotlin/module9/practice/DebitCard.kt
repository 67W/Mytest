package module9.practice

class DebitCard(balance: Int) : BankCard(balance) {

    override fun deposit(cashIn: Int) {
        super.deposit(cashIn)
    }

    override fun getBalanceInfo(): Int {
        println("Debit card balance: $balance")
        return balance
    }
}