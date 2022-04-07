package module9.practice

abstract class BankCard(balance: Int) {

//    abstract val balance: Int
    abstract fun deposit()
    fun pay() {}
    abstract fun getBalanceInfo()
    fun getFreeBalanceInfo() {}
}