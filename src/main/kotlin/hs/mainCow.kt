package hs

fun main() {
    val cow = Cow("white", "black", 1)
    val list = listOf<Cow>(
        cow,
        Cow("white", "black", 2),
        Cow("grey", "white", 1),
        Cow("white", "black", 1),
        Cow("red", "black", 2),
        cow,
        Cow("blue", "black", 1)
    )
    var count1 = 0
    list.forEach {
        if (cow == it) {
            count1 += 1
            println("found same cow")
            println(count1)
        } else {
            println("no cows")
        }
    }
    println("----------")
    var count = 0
    list.forEach {
        if (cow === it) {
            count += 1
            println("found same cow")
            println(count)
        } else {
            println("no cows")
        }
    }
}