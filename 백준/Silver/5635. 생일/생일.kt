import java.time.LocalDate
 
data class People(val name: String, val birthday: LocalDate)
fun main() = with(System.`in`.bufferedReader()) { // 생일
    val list = mutableListOf<People>()
    repeat(readLine().toInt()) {
        val (a, b, c, d) = readLine().split(" ")
        list.add(People(a, LocalDate.parse("$d-${c.padStart(2, '0')}-${b.padStart(2, '0')}")))
    }
    list.sortBy { it.birthday }
    println(list[list.size - 1].name)
    print(list[0].name)
}