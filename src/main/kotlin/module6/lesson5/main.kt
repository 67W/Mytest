package module6.lesson5

//fun sum5(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): Int {
//    // TODO
////    val input = readln().split(" ")
////    println(input)
////    sum5(a1= readln()!!.toInt(), readln()!!.toInt(),readln()!!.toInt(),readln()!!.toInt(),readln()!!.toInt())
////    return when (2..4) {
////        2 -> println(a1 + a2)
////        3 -> println(a1 + a2 + a3)
////    }
//    val input = listOf<String>(readln())
//    val input2: List<String> = input.toString().split(" ")
//    println(input)
//    println(input2)
//    val result =1
//
//
//    return result
//}
fun main() {
    val input: List<String> = readln().split(" ")

    println(input)

        when (input.size) {
            2 -> println(input[0].toInt()+input[0+1].toInt())
            3 -> println(input[0].toInt()+input[0+1].toInt()+input[0+2].toInt())
            4 -> println(input[0].toInt()+input[1].toInt()+input[2].toInt()+input[3].toInt())
            5 -> println(input[0].toInt()+input[1].toInt()+input[2].toInt()+input[3].toInt()+input[4].toInt())
        }

}