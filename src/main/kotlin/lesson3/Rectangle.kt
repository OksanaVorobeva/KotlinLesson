package lesson3

data class Rectangle(
    val width: Double,
    val height: Double
)

fun Rectangle.isSizeValid(): Boolean {
    return this.width > 0 && this.height > 0
}

fun Rectangle.scaled(scale:Double):Rectangle{
    return Rectangle(width*scale,height*scale)
}

val Rectangle.square:Double
    get() = width*height

fun Rectangle?.orEmpty():Rectangle{
    return this?: Rectangle(0.0,0.0)
}

fun drawRectangle(rectangle: Rectangle?){
    val width=rectangle.orEmpty().width
}