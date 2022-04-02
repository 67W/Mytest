package module8.lesson3

fun main() {
    val ktDev = KotlinDeveloper("Alex", 25)
    val javaDev = JavaDeveloper(name = "Ivan", age = 40, experience = 20)
    val cppDev = CppDeveloper(name = "Anna", age = 30, experience = 7)

    ktDev.writeCode()
    println("ktDev level - ${ktDev.getLevel()}")
    println("experience - ${ktDev.experience}")

    javaDev.writeCode()
    println("javaDev level - ${javaDev.getLevel()}")
    println("experience - ${javaDev.experience}")

    cppDev.writeCode()
    println("cppDev level - ${cppDev.getLevel()}")
    println("experience - ${cppDev.experience}")
}