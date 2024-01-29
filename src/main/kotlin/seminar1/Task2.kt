package seminar1

/* Задание No3 “Циклы”
     Написать программу, выводящую на экран фигуру из звёздочек.
     📌 a – количество звёздочек на первой строчке;
     📌 b – количество строк от первой до центральной и от центральной до последней;
     📌 c – количество звёздочек, на которое увеличивается последовательность с каждой строкой.*/

fun main() {
    task(arrayOf("2", "3", "1"))
}

fun task(args: Array<String>) {
    if (args.size < 3) return

    val a = args[0].toInt()
    val b = args[1].toInt()
    val c = args[2].toInt()
    for (i in 0..<b) {
        printStart(a, c, i)
    }
    for (i in b downTo 0){
        printStart(a,c,i)
    }
}

fun printStart(a: Int, c: Int, i: Int) {
    for (j in 1..i * c + a) {
        print('*')
    }
    println()
}