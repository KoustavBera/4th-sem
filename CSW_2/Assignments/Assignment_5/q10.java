package CSW_2.Assignments.Assignment_5;

import java.io.File;
import java.util.Scanner;

public class q10 {
	public static void main(String[] args) {

		File file = new File("diary.txt");
		try {
			Scanner sc = new Scanner(file);
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				System.out.println(line);
			}
			sc.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
