// package CSW_2.Assignments.Assignment_2

import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class q5 {
	public static void main(String[] args) {
		Library l = new Library();
		l.getBooks();
	}
}

class Book {
	long id;
	String name, author;
	int quantity;

	public Book(long id, String name, String author, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "ID:" + id + "\nName:" + name + "\nAuthor:" + author + "\nQuantity:" + quantity + "\n--------------------";
	}
}

class Library {
	public static void getBooks() {
		HashMap<Long, Book> lMap = new HashMap<>();
		lMap.put(12342L, new Book(12342, "The Return of Miss Demini", "Arnould Swatchen", 1));
		lMap.put(12343L, new Book(12343, "Good Brains Thoughts", "Mi An Lee", 2));
		lMap.put(12344L, new Book(12344, "Attackers or Attachers", "Cooper Oppenheimer", 2));
		lMap.put(12345L, new Book(12345, "Midnight Murder Mystery", "Dr. Goth Fernandez", 1));
		System.out.println("Stored books are:");
		for (Map.Entry<Long, Book> h : lMap.entrySet()) {
			System.out.println(h.getValue());
		}
		System.out.println("Enter the book name");
		Scanner sc = new Scanner(System.in);
		String findBook = sc.nextLine();
		int found = 0;
		Book b = new Book(0L, null, null, -1);
		for (Map.Entry<Long, Book> book : lMap.entrySet()) {
			if (book.getValue().name.equals(findBook)) {
				found = 1;
				b = book.getValue();
				break;
			}
		}
		if (found == 1)
			System.out.println("Book found!\n" + b);
		else
			System.out.println("Book not found!");
		System.out.println("Enter the id to be deleted");
		long id = sc.nextLong();
		Book removedBook = lMap.remove(id);
		System.out.println("Removed Book:\n" + removedBook);
	}
}