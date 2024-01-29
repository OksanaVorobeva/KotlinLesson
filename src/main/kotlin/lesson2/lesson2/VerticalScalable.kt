package lesson2

interface VerticalScalable {
    var height:Double

    fun scaleHeightBy(x:Double){
        height*=x
    }
}