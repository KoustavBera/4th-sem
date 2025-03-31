package CSW_2.Assignments.Assignment_5;

import java.util.Scanner;

public class q4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Ask user for initial input
		System.out.print("Enter the initial string: ");
		StringBuilder str = new StringBuilder(sc.nextLine());

		while (true) {
			System.out.println("\n===== StringBuilder Text Editor =====");
			System.out.println("1. Add a substring at a specified position");
			System.out.println("2. Remove a range of characters from the string");
			System.out.println("3. Modify a character at a specified index");
			System.out.println("4. Concatenate another string at the end");
			System.out.println("5. Exit");
			System.out.print("Choose an option: ");

			int choice = sc.nextInt();
			sc.nextLine(); // Consume newline

			switch (choice) {
				case 1: // Insert substring
					System.out.print("Enter the substring to insert: ");
					String insertText = sc.nextLine();
					System.out.print("Enter position to insert at: ");
					int insertIndex = sc.nextInt();
					if (insertIndex >= 0 && insertIndex <= str.length()) {
						str.insert(insertIndex, insertText);
						System.out.println("Updated String: " + str);
					} else {
						System.out.println("Invalid index!");
					}
					break;

				case 2: // Remove characters
					System.out.print("Enter start index to remove: ");
					int startIndex = sc.nextInt();
					System.out.print("Enter end index to remove: ");
					int endIndex = sc.nextInt();
					if (startIndex >= 0 && endIndex <= str.length() && startIndex < endIndex) {
						str.delete(startIndex, endIndex);
						System.out.println("Updated String: " + str);
					} else {
						System.out.println("Invalid range!");
					}
					break;

				case 3: // Modify character
					System.out.print("Enter index to modify: ");
					int modifyIndex = sc.nextInt();
					sc.nextLine(); // Consume newline
					if (modifyIndex >= 0 && modifyIndex < str.length()) {
						System.out.print("Enter new character: ");
						char newChar = sc.nextLine().charAt(0);
						str.setCharAt(modifyIndex, newChar);
						System.out.println("Updated String: " + str);
					} else {
						System.out.println("Invalid index!");
					}
					break;

				case 4: // Concatenate string
					System.out.print("Enter the string to concatenate: ");
					String concatText = sc.nextLine();
					str.append(concatText);
					System.out.println("Updated String: " + str);
					break;

				case 5: // Exit
					System.out.println("Exiting program...");
					sc.close();
					return;

				default:
					System.out.println("Invalid choice! Please try again.");
			}
		}
	}
}
