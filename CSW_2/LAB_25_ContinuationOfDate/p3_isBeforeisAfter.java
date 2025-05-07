package LAB_25_ContinuationOfDate;

import java.time.LocalDate;

public class p3_isBeforeisAfter {

    public static void main(String[] args) {
        boolean beforeornot = LocalDate.parse("2025-05-07").isBefore(LocalDate.parse("2025-03-09"));
        boolean afterornot = LocalDate.parse("2025-03-07").isAfter(LocalDate.parse("2025-03-09"));
        System.out.println("Before : " + beforeornot);
        System.out.println("After : " + afterornot);
    }
}
