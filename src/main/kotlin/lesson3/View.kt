package lesson3

class View (val id:Int, val children:List<View>){

    inline fun IntArray.forEach(action:(Int)->Unit){
        for (e in this){
            action(e)
        }
    }
}


fun findChildren(rootView: View,id:Int):View?{
    if (rootView.id==id){
        return rootView
    }
    for (view in rootView.children){
        val result= findChildren(view,id)
        if (result!=null){
            return result
        }
    }
    return null
}


fun caller(){
    val array = intArrayOf(1, 2, 3, 4)
    array.forEach {
        if (it < 3) {
            return@forEach
        }
        println(it)
    }
}

//параметр типа

fun IntArray.indexOf(e:Int):Int{
    for (i in 0..<this.size){
        if (this[i]==e){
            return i
        }
    }
    return -1
}

fun CharArray.indexOf(e:Char):Int{
    for (i in 0..<this.size){
        if (this[i]==e){
            return i
        }
    }
    return -1
}

fun <T> Array<T>.indexOf(e:T):Int{
    for (i in 0..<this.size){
        if (this[i]==e){
            return i
        }
    }
    return -1
}

//параметизованный класс

class ValueHolder<T>(var value:T)