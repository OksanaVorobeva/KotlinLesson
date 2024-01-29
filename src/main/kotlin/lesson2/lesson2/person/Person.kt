package lesson2.person

class Person(
    val name:String,
    val age:Int,
    val phone:String
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Person

        if (name != other.name) return false
        if (age != other.age) return false
        if (phone != other.phone) return false

        return true
    }

    override fun hashCode(): Int {
        var result=name.hashCode()
        result=31*result+age
        result=31*result+phone.hashCode()
        return result
    }

    override fun toString(): String {
        return "Person(name='$name', age=$age, phone='$phone')"
    }

}