package lesson2

import java.awt.Shape


fun main() {

    val shape: Shape5 = Rectangle5(0.0, 0.0, 2.0, 3.0)
    shape is Rectangle5
    shape is Scalable
    shape is Circle
    val rectangle: Rectangle5 = shape as Rectangle5
    val circle: Circle? = shape as? Circle


}





