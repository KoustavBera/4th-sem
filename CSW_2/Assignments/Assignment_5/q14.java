package CSW_2.Assignments.Assignment_5;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class q14 {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter the source path");
		Scanner sc = new Scanner(System.in);
		Path source = Path.of(sc.nextLine());
		System.out.println("Enter the destination path");
		Path dest = Path.of(sc.nextLine());
		if (!Files.exists(source)) {
			System.out.println("File not found");
			return;
		}
		if (Files.exists(dest)) {
			System.out.println("Destination file already exist! Overwrite?(y/n)");
			String choice = sc.next();
			if (!choice.equalsIgnoreCase("Y")) {
				System.out.println("Operation cancelled");
				return;
			}
			try {
				Files.copy(source, dest, StandardCopyOption.REPLACE_EXISTING);
				System.out.println("Files copied successfully!");
			} catch (IOException e) {
				System.out.println("error:" + e);
			}

		}
	}
}
/*
 * 
 * OUTPUT
 * Enter the source path
 * test10.txt
 * Enter the destination path
 * HeyBuddy.txt
 * Destination file already exist! Overwrite?(y/n)
 * n
 * Operation cancelled
 */