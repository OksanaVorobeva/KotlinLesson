package seminar2


interface ValueChangeListener {
    fun onNewValue(number: Int)
}

class Holder private constructor(number: Int) {
    var listener: ValueChangeListener? = null
    var number: Int = number
        set(value) {
            listener?.onNewValue(number)
            field = value
        }


    companion object {
        const val DEFAULY_NUMBER = 6

        fun creatrHolder(number: Int) = Holder(number)
    }
}

fun main() {
    val holder = Holder.creatrHolder(Holder.DEFAULY_NUMBER)
    holder.number = 9
    holder.listener = object : ValueChangeListener {
        override fun onNewValue(number: Int) {
            println("New value is $number")
        }
    }
    holder.number = 1
}