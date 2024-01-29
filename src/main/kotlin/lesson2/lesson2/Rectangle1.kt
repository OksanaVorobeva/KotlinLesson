package lesson2

import kotlin.math.sqrt

class Rectangle1 (
    var width: Double,
    var height: Double,
    isDiagonalNeeded: Boolean
    ){
    var diagonal: Double?

    init {
        diagonal=if (isDiagonalNeeded){
            sqrt(width * width + height * height)
        }else null
    }

    fun calculateSquare() = width * height

    fun scale(x:Double){
        width*=x
        height*=x
    }
}




