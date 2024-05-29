package jp.ac.it_college.std.s23016.practice.chap2

class AddCalculationExecutorDelegate(private val calculationExecutor: CalculationExecutor):
    CalculationExecutor by calculationExecutor {
    override fun calc(num1: Int, num2: Int): Int {
        return num1 + num2
    }
}