package module11.lesson3

enum class Color(val hex: String) {
    WHITE("#FFF"),
    BLACK("#000"),
    RED("#F00"),
    GREEN("#0F0"),
    BLUE("#00F");

    fun someMethod(){
        println("print something")
    }
}