package seminar2

fun printOperationResult(operation: Operation) {
    val result = operation.calculate()
    println(result)
}


sealed interface Operation {
    fun calculate(): Double
}

class Value(val d: Double) : Operation {
    override fun calculate(): Double = d
}

class Multiply(var left: Operation, var right: Operation) : Operation {
    override fun calculate(): Double = left.calculate() * right.calculate()
}

class Plus(var left: Operation, var right: Operation) : Operation {
    override fun calculate() = left.calculate() + right.calculate()
}


fun main() {
    // Соответствует фор􏰀у􏰁е 4 + 2.5 * 2
    printOperationResult(
        Plus(
            Value(4.0),
            Multiply(
                Value(2.5),
                Value(2.0)
            )
        )
    )

    // Соответствует фор􏰀у􏰁е (1 + 3.5) * (2.5 + 2)
    printOperationResult(
        Multiply(
            Plus(
                Value(1.0),
                Value(3.5)
            ),
            Plus(
                Value(2.5),
                Value(2.0)
            )
        )
    )

    // Соответствует фор􏰀у􏰁е 10
    printOperationResult(
        Value(10.0)
    )
}

