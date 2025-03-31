import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class FileRead {

	public static void main(String[] args) {
		try {
			File obj=new File("C:\\Users\\hp\\Desktop\\2341016317\\OOPs\\src\\myFile.txt");
			Scanner Reader=new Scanner(obj);
			while(Reader.hasNextLine()) {
				String data=Reader.nextLine();
				System.out.println(data);
			}
		}catch(IOException e) {
			System.out.println("An error occurred");
			e.printStackTrace();
		}
	}

}
