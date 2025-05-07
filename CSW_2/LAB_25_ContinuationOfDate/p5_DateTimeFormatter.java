package LAB_25_ContinuationOfDate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class p5_DateTimeFormatter {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = today.format(formatter);
        System.out.println(formattedDate);
    }
}
