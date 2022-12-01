import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class Solution {
    public int daysBetweenDates(String date1, String date2) {
        LocalDate _date1 = LocalDate.parse(date1);
        LocalDate _date2 = LocalDate.parse(date2);
        return (int)Math.abs(ChronoUnit.DAYS.between(_date1, _date2));
    }
}