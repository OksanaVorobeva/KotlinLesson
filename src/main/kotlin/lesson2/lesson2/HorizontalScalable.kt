package lesson2

interface HorizontalScalable {
    var width:Double

    fun scaleWidthBy(x:Double){
        width*=x
    }
}