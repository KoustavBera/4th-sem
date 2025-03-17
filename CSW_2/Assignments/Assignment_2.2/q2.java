//package CSW_2.Assignments.Assignment_2

import java.util.ArrayList;
import java.util.Collections;

public class q2 {
	public static void main(String[] args) {
		ArrayList<User> userList = new ArrayList<>();
		userList.add(new User("Koustav", 20));
		userList.add(new User("Tanishq", 19));
		userList.add(new User("Swetanjana", 21));

		System.out.println("Users before sorting:");
		for (User u : userList) {
			System.out.println("Name: " + u.getName() + ", Age: " + u.getAge());
		}

		// Sort the users by age
		Collections.sort(userList);

		System.out.println("\nUsers after sorting by age:");
		for (User u : userList) {
			System.out.println("Name: " + u.getName() + ", Age: " + u.getAge());
		}
	}
}

class User implements Comparable<User> {
	private String name;
	private int age;

	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public int compareTo(User u2) {
		return this.age - u2.age;
	}
}
