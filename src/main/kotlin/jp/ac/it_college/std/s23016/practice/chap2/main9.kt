package jp.ac.it_college.std.s23016.practice.chap2

fun main() {
    val executor = AddCalculationExecutor(CommonCalculationExecutor())
    executor.printStartMessage()
    println(executor.calc(8, 11))

    val executorDelegate = AddCalculationExecutorDelegate(executor)
    executorDelegate.printStartMessage()
    println(executor.calc(8, 11))

    val person = Person()
    person.name = "Takehata"
    person.address = "Tokyo"
    println(person.name)
    println(person.address)
}
