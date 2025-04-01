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
/*
 * OUTPUT
 * Date :2025-04-01
 * einiunhiuh
 * -----------------------
 * Date: 2025-04-01T16:58:55.225716100
 * gfviytgi
 * -----------------------
 * Date: 2025-04-01T23:28:29.280387700
 * test10.txt
 * -----------------------
 */