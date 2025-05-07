package LAB_24;

import java.time.LocalDate;

public class p3_LocalDatePlusTwoDays {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now().plusDays(1);
        LocalDate today2 = LocalDate.now().plusMonths(1);
        LocalDate today3 = LocalDate.now().plusWeeks(1);
        System.out.println(today);
        System.out.println(today2);
        System.out.println(today3);
    }
}   
