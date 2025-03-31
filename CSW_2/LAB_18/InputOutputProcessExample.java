import java.util.Scanner;
public class InputOutputProcessExample {

	public static void main(String[] args) {
		
		//Following code will create scannerObj object of Scanner class
		Scanner scannerObj=new Scanner(System.in);
		System.out.println("Enter the name of the student");
		
		//Below the line of code ensures that data will be input as string by default
		String studentNAME=scannerObj.next();
		System.out.println("enter the roll number of the student");
		
		//Below the line of code ensures that data will be input as int by default
		int studentRollNumber=scannerObj.nextInt();
		System.out.println("Enter the marks that the student obtained");
		
		//Below line of code ensures that data will be input as float by default
		float studentMarks=scannerObj.nextFloat();
		System.out.println("----Student Report Card------");
		System.out.println("Student Name: "+studentNAME);
		System.out.println("Student Roll No.: "+studentRollNumber);
		System.out.println("StudentMarks: "+studentMarks);

		//following code is needed to avoid resource leak
		scannerObj.close();
	}

}
