import java.io.File;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class q16 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the file path: ");
		String filePath = scanner.nextLine();
		File file = new File(filePath);

		// Check if file exists
		if (!file.exists()) {
			System.out.println("Error: File not found.");
			return;
		}

		System.out.println("File Name: " + file.getName());
		System.out.println("File Path: " + file.getAbsolutePath());
		System.out.println("File Size: " + file.length() + " bytes");
		System.out.println("Readable: " + file.canRead());
		System.out.println("Writable: " + file.canWrite());
		System.out.println("Executable: " + file.canExecute());

		// Get last modified time in readable format
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("Last Modified: " + sdf.format(file.lastModified()));

		// Get more file attributes
		try {
			BasicFileAttributes attr = Files.readAttributes(file.toPath(), BasicFileAttributes.class);
			System.out.println("Creation Time: " + attr.creationTime());
			System.out.println("Last Access Time: " + attr.lastAccessTime());
			System.out.println("Is Directory: " + attr.isDirectory());
			System.out.println("Is Regular File: " + attr.isRegularFile());
			System.out.println("Is Symbolic Link: " + attr.isSymbolicLink());
		} catch (Exception e) {
			System.out.println("Error retrieving file attributes: " + e.getMessage());
		}
	}
}
/*
 * OUTPUT
 * Enter the file path: test1.txt
 * File Name: test1.txt
 * File Path: C:\Users\KOUSTAV BERA\OneDrive\Desktop\4th
 * Sem\self\4th-sem\CSW_2\Assignments\Assignment_5\test1.txt
 * File Size: 16 bytes
 * Readable: true
 * Writable: true
 * Executable: true
 * Last Modified: 2025-04-01 22:57:39
 * Creation Time: 2025-04-01T17:27:35.2695374Z
 * Last Access Time: 2025-04-01T17:50:28.4752361Z
 * Is Directory: false
 * Is Regular File: true
 * Is Symbolic Link: false
 */