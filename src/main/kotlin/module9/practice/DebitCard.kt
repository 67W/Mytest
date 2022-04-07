package module9.practice

class DebitCard(balance: Int): BankCard(balance) {
    val balance = balance
    override fun deposit() {
        TODO("Not yet implemented")
    }

    override fun getBalanceInfo() {
        println("Debit card balance: $balance")
    }
}