package LAB_25_ContinuationOfDate;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class p6_DaysBetween {

    public static void main(String[] args) {
        LocalDate startDate = LocalDate.parse("2025-01-01");
        LocalDate endDate = LocalDate.now();
        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
        System.out.println("Days between :" + daysBetween);
    }
}
