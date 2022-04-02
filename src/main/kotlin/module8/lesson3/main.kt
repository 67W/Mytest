package module8.lesson3

fun main() {
    val ktDev = KotlinDeveloper("Alex", 25)
    val javaDev = JavaDeveloper(name = "Ivan", age = 40, experience = 20)
    val cppDev = CppDeveloper(name = "Anna", age = 30, experience = 7)
    val developer = Developer(name = "MegaMozg", age = 100, experience = 100)
    val scalaDev = ScalaDeveloper(name = "ScalaDeveloper", age = 30, experience = 5)

    ktDev.writeCode()
    println("ktDev level - ${ktDev.getLevel()}")

    javaDev.writeCode()
    println("javaDev level - ${javaDev.getLevel()}")

    cppDev.writeCode()
    println("cppDev level - ${cppDev.getLevel()}")

    developer.writeCode()
    println("developer level - ${developer.getLevel()}")

    println("javaDev paradigm - ${javaDev.paradigm}")
    println("scalaDev paradigm - ${scalaDev.paradigm}")
}