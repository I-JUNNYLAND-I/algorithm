import java.time.LocalDate
import java.time.Period
import java.time.format.DateTimeFormatter
import java.util.*

class Solution {
    fun solution(today: String, terms: Array<String>, privacies: Array<String>): IntArray {
        val answer: LinkedList<Int> = LinkedList()
        val formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd")
        val term: HashMap<String, String> = HashMap()
        val privacy: HashMap<String, String> = HashMap()

        terms.map { it.split(" ") }
            .forEach { term[it[0]] = it[1] }

        val localDates = privacies.map { it.split(" ") }
            .map { LocalDate.parse(it[0], formatter).plusMonths(term[it[1]]?.toLong() ?: 0).minusDays(1) }

        val todayDate = LocalDate.parse(today, formatter)

        val list = localDates.map { Period.between(it, todayDate) }

        for ((index, value) in list.withIndex()) {
            if (value.days > 0 || value.months > 0 || value.years > 0) answer.add(index + 1)
        }

        return answer.toIntArray()
    }
}