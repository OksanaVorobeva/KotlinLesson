package lesson2

class Rectangle5(
    centerX: Double,
    centerY: Double,
    override var width: Double,
    override var height: Double
) : Shape5(centerX, centerY),ScalableRectangle,HorizontalScalable,VerticalScalable {

    private  var currentScale =1.0

    override fun calculateSquare() = width * height

    override fun scaleBy(x: Double) {
        super.scaleBy(x)
        currentScale*=x
    }
}

