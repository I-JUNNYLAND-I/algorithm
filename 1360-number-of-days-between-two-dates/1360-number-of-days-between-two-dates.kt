
import java.time.Duration
import java.time.LocalDate
import java.time.format.DateTimeFormatter

class Solution {
fun daysBetweenDates(date1: String, date2: String): Int = Math.abs(Duration.between(LocalDate.parse(date2, DateTimeFormatter.ofPattern("yyyy-MM-dd")).atStartOfDay(), LocalDate.parse(date1, DateTimeFormatter.ofPattern("yyyy-MM-dd")).atStartOfDay()).toDays().toInt())
}