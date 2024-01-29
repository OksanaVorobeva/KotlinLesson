package lesson2

import kotlin.math.sqrt

class Rectangle(var width: Double, var height: Double) {

    var diagonal: Double = 0.0

    init {
        diagonal = sqrt(width * width + height * height)
    }

    fun calculateSquare() = width * height


    override fun toString(): String {
        return "${calculateSquare()},${diagonal}"
    }


}