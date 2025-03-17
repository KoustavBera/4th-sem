package CSW_2.Assignments.Assignment_2;

import java.util.Scanner;

public class q7 {
	static class Student implements Comparable<Student> {
		String name;
		int rollNo, age;

		public Student(String name, int rollNo, int age) {
			this.age = age;
			this.name = name;
			this.rollNo = rollNo;
		}

		public int compareTo(Student s2) {
			if (!(s2.rollNo == this.rollNo)) {
				return this.rollNo - s2.rollNo;
			}
			return this.age - s2.age;
		}
	}

	public static void main(String[] args) {
		System.out.println("How many student data you want to enter ? ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Student obArr[] = new Student[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter student " + (i + 1) + " data");
			System.out.println("Name:");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Enter roll number");
			int roll = sc.nextInt();
			System.out.println("Enter age");
			int age = sc.nextInt();
			obArr[i] = new Student(name, roll, age);
		}

	}
}
