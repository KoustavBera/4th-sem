package CSW_2.Assignments.Assignment_5;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Scanner;

public class q9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String filename = "diary.txt";

        File file = new File(filename);
        if (file.exists()) {
            System.out.println("File already exists. your content will be added to the file");

        } else {
            System.out.println("Creating file...");
        }
        System.out.println("Enter contents of file");
        String entry = sc.nextLine();
        LocalDate curDate = LocalDate.now();
        // write
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);

            printWriter.println("Date :" + curDate);
            printWriter.println(entry);
            printWriter.println("-----------------------");
            printWriter.close();
            System.out.println("File created successfully");
            sc.close();
        } catch (Exception e) {
            System.out.println("Unable to write file. Try again");
            e.printStackTrace();
            sc.close();
        }
    }
}
/*
 * OUTPUT
 * Enter contents of file
 * HI I AM KOUSTAC
 * File created successfully
 */
