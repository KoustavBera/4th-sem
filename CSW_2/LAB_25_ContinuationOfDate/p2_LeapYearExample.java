package LAB_25_ContinuationOfDate;

import java.time.LocalDate;

public class p2_LeapYearExample {

    public static void main(String[] args) {
        boolean isItLeapYear = LocalDate.now().isLeapYear();
        System.out.println("Is leap year ? :" + isItLeapYear);
        boolean is = LocalDate.parse("2004-04-18").isLeapYear();
        System.out.println("Is 2004 a leap year ? " + is);// Leap Year -> if it is divisible by 100 also be divisible by 400
    }
}
