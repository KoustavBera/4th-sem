class Complexx{
	private double re,im;
	public Complexx(double re, double im) {
		this.re=re;
		this.im=im;
	}
	//overriding the equals method
	public boolean equals(Object o) { //no need to define Object class as it is pre defined
		
		//if the object is compared with itself then return true
		if(o==this) //we have defined THIS in the previous class.So it refers to re and im
			return true;
		if(!(o instanceof Complexx)) //creating an instance of Complexx and then checking if not equal
			return false;
		
		//type cast o to Complex so that we can compare data members
		Complexx c=(Complexx) o;
		
		//Compare the data member and return accordingly
		return Double.compare(re, c.re)==0 && Double.compare(im, c.im)==0;
//re and im are defined in Complexx class; c.re and c.im belong to the Object o which has been typecasted		
	}
}
//driver class to test complex class
public class Equals2 {
	public static void main(String[] args) {
		Complexx c1=new Complexx(10, 15);
		Complexx c2=new Complexx(10, 15);
		if(c1.equals(c2)) 
			System.out.println("Equal");
		else
			System.out.println("Not equal");
	}

}
