package lesson2.task2

fun main(){
    /*AppSetting.lastLogin="av"
    AppSetting.save()*/
    val setting=AppSetting
    setting.lastLogin = "av"
    setting.save()
}