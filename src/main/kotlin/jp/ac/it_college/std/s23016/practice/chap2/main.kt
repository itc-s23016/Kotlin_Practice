package jp.ac.it_college.std.s23016.practice.chap2

import User4

typealias Calc = (Int, Int) -> Int

fun main() {
    val user = User3()
    user.name = "ほげ"
    println(user.name)
//    user.name = null  // コンパイルエラー

    println("----2.2.8--2.2.9")
    val user4 = User4()
    user4.name = ""
    println("isValidName: ${user4.isValidName}")
    user4.name = "タカシ"
    println("isValidName: ${user4.isValidName}")
    println("----2.5.10--2.5.11----")
    printCalcResult(3,4) {x, y -> x * y}
}

val User4.isValidName: Boolean
    get() = name != ""

fun printCalcResult(num1: Int, num2: Int, calc: Calc) {
    val result = calc(num1, num2)
    println("計算結果: $result")
}