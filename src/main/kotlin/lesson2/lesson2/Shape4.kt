package lesson2

open class Shape4 (
    var centerX:Double,
    var centerY: Double
){
    fun moveBy(dx:Double,dy:Double){
        centerX=dx
        centerY=dy
    }

}