package seminar2

class MyClass {

    val a:Int
    val b:Double

 /*   init {
        this.a=a
    }*/
    constructor(a:Double){
        this.a=a.toInt()
        this.b=a
    }
    constructor(a:Int){
        this.a=a
        this.b=a.toDouble()
    }
}

fun main(){
   val mc=MyClass(10)
   val mc2=MyClass(10.0)

}