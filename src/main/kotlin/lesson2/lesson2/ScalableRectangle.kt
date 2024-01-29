package lesson2

interface ScalableRectangle:Scalable {

    var width: Double
    var height: Double


    override fun scaleBy(x: Double) {
        width*=x
        height*=x
    }
}