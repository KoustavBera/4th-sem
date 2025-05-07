package LAB_25_ContinuationOfDate;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class p1_DayTimeParse {

    public static void main(String[] args) {
        DayOfWeek theDay = LocalDate.parse("2004-03-18").getDayOfWeek();
        System.out.println(theDay);
    }
}
