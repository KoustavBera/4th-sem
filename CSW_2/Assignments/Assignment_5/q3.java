package CSW_2.Assignments.Assignment_5;

import java.util.Scanner;

public class q3 {
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Simple Text Editor");
			System.out.println("1. Append a given string to the existing text.");
			System.out.println("2. Insert a given string at a specified index within the existing text. .");
			System.out.println("3. Delete a portion of text between two specified indices. ");
			System.out.println("4. Reverse the entire text. ");
			System.out.println("5. . Replace a portion of the text between two specified indices with a given string");
			System.out.println("6. Exit");

			System.out.println("Enter choice");
			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
				case 1:
					System.out.println("Enter text to append");
					String appendText = sc.nextLine();
					str.append(appendText);
					System.out.println("After Appendtion == " + str.toString());
					break;

				case 2:
					System.out.println("Enter index and string ");
					String insertText = sc.nextLine();
					int insertIndex = sc.nextInt();
					if (insertIndex >= 0 && insertIndex <= str.length()) {
						str.insert(insertIndex, insertText);
						System.out.println("After Insertion == " + str.toString());
					} else {
						System.out.println("Invalid index");
					}
					break;

				case 3:
					System.out.println("Enter starting index and last index");
					int startIndex = sc.nextInt();
					int lastIndex = sc.nextInt();
					if (startIndex >= 0 && lastIndex <= str.length() && startIndex < lastIndex) {
						str.delete(startIndex, lastIndex);
						System.out.println("After deletion == " + str.toString());
					} else {
						System.out.println("Invalid index");
					}
					break;

				case 4:
					String reverse = str.reverse().toString();
					System.out.println("After reversion  == " + reverse);
					break;

				case 5:
					System.out.print("Enter start index for replacement: ");
					int startReplace = sc.nextInt();
					System.out.print("Enter end index for replacement: ");
					int endReplace = sc.nextInt();
					sc.nextLine(); // Consume newline
					System.out.print("Enter replacement text: ");
					String replaceText = sc.nextLine();
					if (startReplace >= 0 && endReplace <= str.length() && startReplace < endReplace) {
						str.replace(startReplace, endReplace, replaceText);
					} else {
						System.out.println("Invalid indices!");
					}
					break;

				case 6:
					System.out.println("Exiting program...");
					sc.close();
					break;

				default:
					System.out.println("Invalid choice");

					break;

			}

			// Display the updated text and StringBuffer properties
			System.out.println("\nCurrent Text: " + str);
			System.out.println("Length: " + str.length());
			System.out.println("Capacity: " + str.capacity());
			sc.close();
		}
	}
}
