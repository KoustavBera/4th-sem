
public class StringBuilder2 {

	public static void main(String[] args) {
		String str="Hello";
		System.out.println(str);
		str.concat("2K3");//string is immutable so str.concat("2K3") will not work and the output will be Hello[
		System.out.println(str);
		str=str.concat("2K3");	//but when a new variable str is created then it will change to Hello2K3
		System.out.println(str); //because a new location is alloted to the above variable
	}


}
