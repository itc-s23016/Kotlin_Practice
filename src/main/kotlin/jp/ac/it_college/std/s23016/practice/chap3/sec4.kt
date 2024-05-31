package jp.ac.it_college.std.s23016.practice.chap3

fun main() {
    val user = UserJava()
    user.id = 100
    user.name = "Takehata"
    println(user.id)
    println(user.name)

    println("----3.4.4----")
    val function = CalcJava { num1, num2 -> num1 + num2 }
    println(function.calc(1,3))

    println("----3.4.5----")
    executeCalc(1, 3) { num1, num2 -> num1 + num2 }

    println("----3.4.7+----")
    println(CompanyConstants.maxEmployeeCount)

}

fun executeCalc(num1: Int, num2: Int, function: CalcJava) {
    println(function.calc(num1,num2))
}