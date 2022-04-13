package module9.practice

abstract class DebitCard(balance: Int) : BankCard(balance) {

    override fun getBalanceInfo(): Int {
        println("Debit card balance: $balance")
        return balance
    }
}