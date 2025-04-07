package CSW_2.Assignments.Assignment_5;

import java.io.File;
import java.util.Scanner;

public class q12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the directory path");
		String dirPath = sc.nextLine();
		File dir = new File(dirPath);
		if (!dir.exists()) {
			System.out.println("Directory does not exists");
		} else if (!dir.isDirectory()) {
			System.out.println("Path is not a directory");
		} else {
			System.out.println("Listing files and directory in  : " + dirPath);

			File[] file__list = dir.listFiles();
			if (file__list != null && file__list.length > 0) {
				for (File file : file__list) {
					if (file.isFile())
						System.out.println("[file] " + file.getName());
					if (file.isDirectory())
						System.out.println("[dir] " + file.getName());
				}
			} else {
				System.out.println("Directory is empty!");
			}
		}
	}
}
/*
 * OUTPUT
 * Listing files and directory in : C:\Users\<username>\OneDrive\Desktop\4th Sem
 * [file] diary.txt
 * [file] q1.java
 * [file] q8.java
 * [file] q9.java
 * [file] test10.txt
 */