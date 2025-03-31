import java.io.File;
import java.io.IOException;
public class FileCreation {

	public static void main(String[] args) {
		try {
			File obj=new File("C:\\Users\\hp\\Desktop\\2341016317\\OOPs\\src\\myFile.txt");
			//creating file
			if(obj.createNewFile())
				System.out.println("file created "+obj.getName());
			else
			System.out.println("file already exists");
	}catch(IOException e) {
		System.out.println("An error occurred");
		e.printStackTrace();
	}

}
}