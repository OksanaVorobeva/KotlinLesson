package lesson1

fun main(vararg args: String) {

    task1("1,2,4")
    task2("23", "43")
    task3()
    task4("av@exampl.com")
    greet("Ivan", "Petr")
    greetAll("Ivan", "Petr")
    println(printAny(45))
    println(printAny(45L))
    println(printAny(45.7))
    println(printAny("GGG"))
    println(println(null))
    processBoolean(false)
    processBoolean(true)
    processBoolean(null)

    v="str"
    println(v)

    val array=IntArray(5)
    array.fill(3)
    array[3]=20
    println(array.joinToString())
    println("array size =${array.size}")

    val array1= arrayOf(1,2,3)
    println(array1.joinToString())

    val range=0..<6 step 2
    for (a in range){
        println(a)
    }

    val range1= 10 downTo 0 step 2
    for (a in range1){
        println(a)
    }

    val a=3
    val b=14
    println(a in range)
    println(b in range)


}

fun task1(vararg args: String) {
    for (arg in args) {
        println(arg)
    }
}

fun task2(vararg args: String) {
    if (args.size >= 2) {
        val a = args[0].toIntOrNull()
        val b = args[1].toIntOrNull()
        if (a != null && b != null) {
            val sum = a + b
            println("sum=$sum")
            return
        }
    }
    println("Error in arguments")
}

fun task3() {
    val a: Double = 34.0
    val b: Float = 32.0f
    val c: Int = 34
    val d: Long = 12L

    val e: Int = a.toInt()
    println(e)
}

fun task4(vararg args: String) {
    val email = args[0]

    val parts = email.split('@')
    if (parts.size != 2) {
        println("Invalid email")
        return
    }
    for (part in parts) {
        println(part)
    }
    println("user =${parts[0]}, address=${parts[1]}")
}

fun greet(vararg names: String) {
    for (name in names) {
        println("Hello,$name")
    }
}

fun greetAll(vararg names: String) {
    greet(*names, "David")
}

/*fun printAny(a: Any?) = if (a != null) {
    a.toString()
} else {
    "null"
}*/

fun printAny(a: Any?) = a?.toString() ?: "null"

/*fun processBoolean(a:Boolean?){
    if (a==true){
        println("true")
    }else{
        println("false or null")
    }
}*/

fun processBoolean(a: Boolean?) {
    when (a) {
        true -> println("true")
        false -> println("false")
        else -> println("null")
    }
}

lateinit var v:String







