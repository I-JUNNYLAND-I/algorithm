import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class Solution {
    public int daysBetweenDates(String date1, String date2) {
        int days = 0;
        LocalDate d1 = parseDate(date1);
        LocalDate d2 = parseDate(date2);

        //d1이 d2보다 느린경우
        if(d1.compareTo(d2) < 0) {
            days = (int) ChronoUnit.DAYS.between(d1, d2);
        } else {
            days = (int) ChronoUnit.DAYS.between(d2, d1);
        }
        
        return days;
    }
    
    public LocalDate parseDate(String dateWithDash) {
        int year = Integer.valueOf(dateWithDash.substring(0,4));
        int month = Integer.valueOf(dateWithDash.substring(5,7));
        int day = Integer.valueOf(dateWithDash.substring(8,10));

        return LocalDate.of(year, month, day);
    }
}