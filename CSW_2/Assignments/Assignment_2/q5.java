package CSW_2.Assignments.Assignment_2;

import java.util.ArrayList;
import java.util.Scanner;

public class q5 {
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
	public static ArrayList<Student> bubbleSort(Student[] objArr){
		ArrayList<Student> ans = new ArrayList<>();
		for(int i=0;i<objArr.length;i++){
			for(int j=0;j<objArr.length-i-1; j++){
				if(objArr[j+1].rollNumber>objArr[j].rollNumber){
					Student temp = objArr[j];
					objArr[j]=objArr[j+1];
					objArr[j+1]=temp;
				}
			}
			ans.add(objArr[objArr.length-i-1]);
		}
		return ans;
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
	System.out.println("********** Bubble Sort ******");
	ArrayList<Student> ans = Student.bubbleSort(obArr);
	for(Student e:ans){
		System.out.println(e+"\n");
	}
}
	
}
