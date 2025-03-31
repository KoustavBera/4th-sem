package CSW_2.Assignments.Assignment_5;

import java.io.File;
import java.util.Scanner;

public class q13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter file to be deleted");
		String filename = sc.next();
		File file = new File(filename);
		if (!file.exists()) {
			System.out.println("file does not exist");
			sc.close();
			return;
		} else {
			try {
				file.delete();
				System.out.println("file deleted successfully");
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}
}
