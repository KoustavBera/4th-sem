package CSW_2.Assignments.Assignment_5;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.Scanner;

public class q11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String filename = "diary.txt";

		File file = new File(filename);
		if (file.exists()) {
			System.out.println("File already exists. Your content will be added to the file.");
		} else {
			System.out.println("Creating a new diary file...");
		}

		System.out.println("Enter contents of file:");
		String entry = sc.nextLine();
		LocalDateTime curDate = LocalDateTime.now();

		// Write to the file
		try (FileWriter fileWriter = new FileWriter(file, true);
				BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
				PrintWriter printWriter = new PrintWriter(bufferedWriter)) {

			printWriter.println("Date: " + curDate);
			printWriter.println(entry);
			printWriter.println("-----------------------");

			System.out.println("Diary entry added successfully!");
		} catch (IOException e) {
			System.out.println("Unable to write to file. Try again.");
			e.printStackTrace();
		}

		sc.close(); // Close Scanner outside try-catch
	}
}
