package module9.practice

class CreditCard(balance: Int) : BankCard(balance) {
    val creditLimit: Int = 10000
    val balance = balance
    override fun deposit() {
        TODO("Not yet implemented")
    }

    override fun getBalanceInfo() {
        println("Credit card balance: $balance")
    }

}