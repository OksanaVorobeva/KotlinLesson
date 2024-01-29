package lesson2

class Rectangle2(width: Double, height: Double) {
    var width: Double
    var height: Double

    init {
        this.width = width
        this.height = height
    }

    fun calculateSquare() = width * height

}