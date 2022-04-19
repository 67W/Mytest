package hs

import kotlin.math.hypot

fun perimeter(
    x1: Double = 0.0,
    y1: Double = 0.0,
    x2: Double = 0.0,
    y2: Double = 0.0,
    x3: Double = 0.0,
    y3: Double = 0.0,
    x4: Double = 0.0,
    y4: Double = 0.0,
    x5: Double = 0.0,
    y5: Double = 0.0
): Double {
    val abX = x2 - x1
    val abY = y2 - y1

    val bcX = x3 - x2
    val bcY = y3 - y2

    val cdX = x4 - x3
    val cdY = y4 - y3

    val daX = x1 - x4
    val daY = y1 - y4

    val ab = hypot(abX, abY)
    val bc = hypot(bcX, bcY)
    val cd = hypot(cdX, cdY)
    val da = hypot(daX, daY)
//    println(ab)
//    println(bc)
//    println(cd)
//    println(da)
//
    println(ab + bc + cd + da)
    return ab + bc + cd + da
}
fun main() {
//    perimeter(0.0,0.0,12.0,0.0,0.0,5.0)
//    println(perimeter(0.0,0.0,12.0,0.0,0.0,5.0))
//    println(perimeter(1.0,1.0,-1.0,1.0,-1.0,-1.0,1.0,-1.0))
    println(perimeter(1.0,1.0,4.0,1.0,4.0,5.0,0.0,0.0))
}