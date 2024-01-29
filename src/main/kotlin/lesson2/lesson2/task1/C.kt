package lesson2.task1

class C : A, B {

    override fun printName() {
        super<A>.printName()
        super<B>.printName()
    }
}

