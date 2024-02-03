package seminar3


data class Entry(
    val city: String,
    val name: String,
    val age: Int
)
val entries = listOf(
    Entry("London", "Liam", 28),
    Entry("Berlin", "Oliver", 24),
    Entry("Madrid", "Oliver", 45),
    Entry("Berlin", "Jerry", 29),
    Entry("London", "Oliver", 19),
    Entry("Madrid", "Kate", 16),
    Entry("Berlin", "Oliver", 34),
    Entry("London", "Kate", 25),
    Entry("Berlin", "Oliver", 23),
    Entry("Milan", "Jerry", 28),
    Entry("Paris", "Charles", 44)

)
/*

При помощи стандартных функций-расширений для работы с коллекциями вывести на экран:
1. Количество людей в городе London в возрасте от 21 до 30 лет включительно.
2. Список имён без повторений для города Berlin.
3. Список городов, в которых есть хотя бы один человек по
имени Oliver.
15 минут*/

fun main(){
    val people21to30London= entries
        .filter { it.city=="London" }
        .count {it.age in 21..30}
    println(people21to30London)

    val uniqueNamesBerlin= entries
        .filter { it.city=="Berlin" }
        .map { it.name }
        .toSet()
    println(uniqueNamesBerlin.joinToString())

    val citiesWithOliver= entries
        .filter { it.name=="Oliver" }
        .map { it.city }
        .toSet()
    println(citiesWithOliver.joinToString())
}