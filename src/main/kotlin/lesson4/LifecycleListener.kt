package lesson4

interface LifecycleListener {

    fun onCreate()
    fun onStart()
    fun inResume()
    fun onPause()
    fun onStop()
    fun onDestroy()
}