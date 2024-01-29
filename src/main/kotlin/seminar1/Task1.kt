package seminar1

fun main() {
    /*  Написать простую программу, которая принимает в качестве аргументов
      два целых числа и выводит на экран их сумму. Всю программу можно
      написать внутри функции main.*/

    sum("13", "17")
    println(sum1(1, 3))

    println("sumAll = ${sumAll(1, 5, 20)}")
    println("sumAll = ${sumAll()}")
    println("sumAll = ${sumAll(2, 3, 4, 5, 6, 7)}")

    println(createOutputString("Alice"))
    println(createOutputString("Bob", 23))
    println(createOutputString(isStudent = true, name = "Carol", age = 19))
    println(createOutputString("Daniel", 32, isStudent = null))
    println(multiplyBy(null, 4))
    println(multiplyBy(3, 4))


}

fun sum(vararg args: String) {
    if (args.size >= 2) {
        val a = args[0].toIntOrNull()
        val b = args[1].toIntOrNull()
        if (a != null && b != null) {
            val sum = a + b
            println("sum =$sum")
            return
        }
    }
    println("Error")
}

fun sum1(vararg num: Int) = num.sum()


fun sumAll(vararg numbers: Int): Int {
    var result=0
    for (number in numbers){
        result+=number
    }
    return result
}


fun createOutputString(name: String, age: Int = 42, isStudent: Boolean? = null): String {
    val studentPrefix=if (isStudent==true) "student" else ""
    return "$studentPrefix$name has age of $age"
}


fun multiplyBy(a: Int?, b: Int): Int? {
    return if (a!=null) a*b else null
}




