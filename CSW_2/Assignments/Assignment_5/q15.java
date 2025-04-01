package CSW_2.Assignments.Assignment_5;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class q15 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file name");
		String source = sc.next();
		File oldFile = new File(source);
		System.out.println("Rename");
		String dest = sc.next();
		File newFile = new File(dest);
		if (!oldFile.exists() || !newFile.exists()) {
			System.out.println("File does not exist");
		}
		if (oldFile.renameTo(newFile)) {
			System.out.println("File rename success");
		} else {
			System.out.println("Failed to rename");
		}
	}
}
/*
 * OUTPUT
 * Enter the file name
 * test1.txt
 * Rename
 * test10.txt
 * File does not exist
 * File rename success
 * 
 */