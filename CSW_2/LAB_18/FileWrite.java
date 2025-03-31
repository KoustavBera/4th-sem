import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class FileWrite {

	public static void main(String[] args) {
		try {
			FileWriter wr=new FileWriter("C:\\Users\\hp\\Desktop\\2341016317\\OOPs\\src\\myFile.txt");
			//writing in file
			wr.write("Hello, I am writing Java");
			wr.close();
			System.out.println("Written successfully");
		}catch(IOException e) {
			System.out.println("An error occurred");
			e.printStackTrace();
		}

	}

}
