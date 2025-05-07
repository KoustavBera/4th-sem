package LAB_25_ContinuationOfDate;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class p7_RateOfInterest {

    public static void main(String[] args) {
        LocalDate startDate = LocalDate.parse("2025-01-01");
        LocalDate endDate = LocalDate.now();
        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);

        double y = (double) daysBetween / 365.0;
        double r = 0.08;
        double p = 1000;
        System.out.println("Interest " + (y * r * p));
    }
}
