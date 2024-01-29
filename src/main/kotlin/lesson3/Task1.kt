package lesson3

fun main() {
    val rectangle = Rectangle(2.0, 3.0)
    val result = add.invoke(3, 4)
    val result2 = add(3, 4)
    val square = rectangle.squareCalc()
    val array = intArrayOf(1, 3, 2)
    //val arrayHasValueMoreThan2 = any(array) { it > 2 }
    val arrayHasValueMoreThan2 = array.any { it > 2 }
    println(arrayHasValueMoreThan2)
    val arrayHasValueMoreThan3=array.any (fun (a:Int):Boolean{return a>2})
    val array1= intArrayOf(1,2,3,4)
    array1.forEach { println(it) }
}

val add = { a: Int, b: Int -> a + b }

val add2 = { a: Int, b: Int ->
    println("Calculating $a+$b")
    a + b
}

val add3: (Int, Int) -> Int = { a, b -> a + b }

val invert: (Int) -> Int = { -it }

val squareCalc: Rectangle.() -> Double = {
    this.width * this.height
}

/*fun any(array: IntArray, predicate: (Int) -> Boolean): Boolean {
    for (e in array) {
        if (predicate(e)) return true
    }
    return false
}*/

fun IntArray.any(predicate: (Int) -> Boolean): Boolean {
    for (e in this) {
        if (predicate(e)) return true
    }
    return false
}

fun isOdd(a: Int): Boolean {
    return a % 2 == 1
}

class A(val a: Int) {
    fun isMyValue(a: Int): Boolean = this.a == a
}

fun callAny() {
    val array = intArrayOf(2, 3, 4)
    val arrayHasValueMoreThan2 = array.any { it > 2 }
    val arrayHasOddValue = array.any(::isOdd)

    val a = A(3)
    val arrayHasValueOfA = array.any(a::isMyValue)

}

//inline - функция

inline fun IntArray.forEach(action: (Int)->Unit){
    for (e in this){
        action(e)
    }
}


