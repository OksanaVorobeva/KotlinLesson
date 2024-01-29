package lesson1

fun main() {
    val a: Int
    a = 10
    val b: Int = 10
    val c = 10

    val name: String
    name = "Alice"

    var age: Int = 23
    age = 24
    age = 42

    val a1: IntArray = intArrayOf(4, 6, 8)
    val size = a1.size
    val first = a1[0]

    val b1: IntArray = IntArray(5)
    b1.fill(0)
    b1[1] = 100

    var str: String
    str = "Alice"

    var steOrNull: String?
    steOrNull = "Alice"
    steOrNull = null




    fun processStr(strOrNull: String?) {
        val isKm = if (strOrNull != null) {
            strOrNull.endsWith("km")
        } else {
            false
        }


        fun neg(a: Int): Int = -a

        fun mult(a: Int, b: Int) = a * b

        fun print1() {
            println(1)
        }

        fun print2(): Unit {
            println(2)
        }

        fun doNothing() = Unit

        fun first(name: String, age: Int = 18) {

        }

        fun second() {
            first("Alice")
            first("Bob", 47)
        }
    }
}

