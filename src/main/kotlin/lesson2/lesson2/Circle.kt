package lesson2

class Circle(
    centerX: Double,
    centerY: Double,
    var radius: Double
) : Shape5(centerX, centerY) {
    override fun calculateSquare() = Math.PI * radius * radius
}
