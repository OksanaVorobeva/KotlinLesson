package lesson2

class Rectangle4 : Shape4 {
    var width: Double
    var height: Double

    constructor(
        centerX: Double,
        centerY: Double,
        width: Double,
        height: Double
    ) : super(centerX, centerY) {
        this.width = width
        this.height = height
    }

    constructor(
        centerX: Double,
        centerY: Double
    ) : this(centerX, centerY, 0.0, 0.0)
}