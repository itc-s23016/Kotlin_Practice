package jp.ac.it_college.std.s23016.practice.chap2

class CommonCalculationExecutor(override val message: String = "calc"): CalculationExecutor {
    override fun calc(num1: Int, num2: Int): Int {
        throw IllegalStateException("Not Implements calc")
    }

    override fun printStartMessage() {
        println("start $message")
    }

}