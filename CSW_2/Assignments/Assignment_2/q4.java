package CSW_2.Assignments.Assignment_2;

import java.util.Scanner;

public class q4 {
static class Student implements Comparable<Student>{
	String name;
	int rollNumber;
	double totalMarks;

	//constructor
	public Student(String name,int rollNumber, double totalMarks){
		this.name = name;
		this.rollNumber = rollNumber;
		this.totalMarks = totalMarks;
	}

	@Override
	public int compareTo(Student s2){
   return Double.compare(this.totalMarks, s2.totalMarks);	
	}
	@Override
	public String toString(){
		return "Name: "+name + "\nRoll Number: "+rollNumber+"\nTotal Marks: "+totalMarks;
	}
}
public static void main(String[] args) {
	System.out.println("How many student data you want to enter ? ");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	Student obArr[]=new Student[n];
	for(int i= 0 ; i < n; i++){
		System.out.println("Enter student "+i+" data");
		System.out.println("Name:");
  sc.nextLine();
		String name = sc.nextLine();
		System.out.println("Enter roll number");
		int roll =sc.nextInt();
		System.out.println("Enter marks");
		double marks = sc.nextDouble();
  obArr[i]=new Student(name, roll, marks);
	}
 System.out.println("Student data uploading complete...");
	System.out.println("********** Linear Search ******");
	System.out.println("Enter the Student roll number");
	int roll = sc.nextInt();
	int flag = 0;
 Student topper=new Student(null, 0, 0.0);
	for(Student s: obArr){
		topper = s.compareTo(topper)>0?s:topper;
		if(s.rollNumber == roll){
			System.out.println("Success!"+"\n"+s);
			flag=1;
		}
	}
	if(flag == 0) System.out.println("No student exist!");

	System.out.println("******** Topper Selection ********");
 System.out.println(topper);
}
	
}
