class Complex12{
	private double re,im;
	public Complex12(double re,double im) {
		this.re=re;
		this.im=im;
	}
	
	//getters
	public double getReal() {
		return this.re;
	}
	public double getImaginary() {
		return this.im;
	}
	
	//setters
	public void setReal(double re) {
		this.re=re;
	}
	public void setImaginary() {
		this.im=im;
	}
	//overriding toString() method of String class
	public String toString() {
		return this.re+"+"+this.im+"i";
	}
}
public class ToString2 {

	public static void main(String[] args) {
		Complex12 c=new Complex12(2.5,6.7);
		System.out.println(c);
		Complex12 n=new Complex12(1.2,4.3);
		System.out.println(n);
	}

}
