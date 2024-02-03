package lesson4

class DecoratedLifeListener (
    private val innerLifecycleListener: LifecycleListener):LifecycleListener by innerLifecycleListener {
    override fun inResume() {
        innerLifecycleListener.inResume()
    }
}