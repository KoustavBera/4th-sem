class Complex{
	 private int r,i;
	public Complex(int r, int i) {
		this.r=r;
		this.i=i;
	}
}
public class Equals1 {

	public static void main(String[] args) {
		Complex c1=new Complex(11,13);
		Complex c2=new Complex(11,13);//here two different objects are created
		if(c1==c2) //while comparing c1 and c2 it compares the objects and not the content inside the objects 
			System.out.println("Equal");
		else
			System.out.println("Not equal"); //Since two objects can never be same no matter what the content
											//inside is we get the output as not equal.
	}

}
