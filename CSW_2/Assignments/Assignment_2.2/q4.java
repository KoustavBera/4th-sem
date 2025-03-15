// package CSW_2.Assignments.Assignment_2

import java.util.LinkedList;
import java.util.Scanner;

public class q4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		LinkedList<Student> s = new LinkedList<>();
		s.add(new Student("Koustav Bera", 20, 9.5));
		s.add(new Student("Swetanjana Bera", 20, 9.2));
		s.add(new Student("Donald Trump", 75, 5.2));

		// a) Display the list of students.
		for (Student st : s) {
			System.out.println(st);
		}

		/*
		 * b) Prompt the user to enter a Student object and check its existence in the
		 * list. Specify
		 * whether the search is based on reference comparison or content comparison
		 * using the
		 * L3, L4 contains method.
		 */
		System.out.println("Enter student details to check (name, age, mark):");

		String name = scanner.nextLine();
		int age = scanner.nextInt();
		double mark = scanner.nextDouble();
		scanner.nextLine();
		Student searchStudent = new Student(name, age, mark);

		if (s.contains(searchStudent)) {
			System.out.println("Student found!\n" + searchStudent);
		} else
			System.out.println("Student not found!");
		// (c) Remove a specified student
		System.out.println("Enter student details to remove (name, age, mark):");

		name = scanner.nextLine();
		age = scanner.nextInt();
		mark = scanner.nextDouble();
		scanner.nextLine();
		Student removeStudent = new Student(name, age, mark);

		if (s.remove(removeStudent)) {
			System.out.println("Student removed!\n" + removeStudent);
		} else {
			System.out.println("Student not found!");
		}
		// (d) Count the number of students
		System.out.println("Number of students in the list: " + s.size());
	}
}

class Student {
	String name;
	int age;
	double marks;

	public Student(String name, int age, double marks) {
		this.name = name;
		this.age = age;
		this.marks = marks;
	}

	// getters
	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public double getMarks() {
		return this.marks;
	}

	// setters
	public void setName(String n) {
		this.name = n;
	}

	public void setAge(int n) {
		this.age = n;
	}

	public void setMarks(double n) {
		this.marks = n;
	}

	@Override
	public boolean equals(Object ob2) {
		if (this == ob2)
			return true;
		if (ob2 == null || getClass() != ob2.getClass())
			return false;
		Student student = (Student) ob2;
		return Integer.compare(student.age, age) == 0 && Double.compare(student.marks, marks) == 0
				&& name.equals(student.name);
	}

	public String toString() {
		return "Name:" + name + "\nAge:" + age + "\nMarks:" + marks + "\n-------------";
	}
}