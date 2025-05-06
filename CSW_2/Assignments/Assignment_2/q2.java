package Assignment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class q2 {
	public static void main(String[] args) {
		ArrayList<User> users = new ArrayList<>();
		users.add(new User("Koustav", 21));
		users.add(new User("Koustav1", 22));
		users.add(new User("Koustav2", 23));
		System.out.println("Before sort");
		users.forEach(user -> System.out.println(user));
		Collections.sort(users, new Comparator<User>() {
			@Override
			public int compare(User u1, User u2) {
				return Integer.compare(u1.getAge(), u2.getAge());
			}
		});
		System.out.println("After sort");
		users.forEach(user -> System.out.println(user));
	}
}

class User {
	String name;
	int age;

	// constructor
	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// getter
	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	// setter
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return "Name : " + this.name + "\nAge : " + this.age;
	}
}
