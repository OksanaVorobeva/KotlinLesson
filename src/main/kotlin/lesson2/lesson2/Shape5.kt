package lesson2

abstract class Shape5 (
    var centerX:Double,
    var centerY: Double
    ){
        fun moveBy(dx:Double,dy:Double){
            centerX=dx
            centerY=dy
        }

    abstract fun calculateSquare():Double
}