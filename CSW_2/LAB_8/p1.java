package LAB_8;

class Complex1 {

    private double re, im;

    public Complex1(double re, double im) {
        this.re = re;
        this.im = im;
    }

    //Getters
    public double getReal() {
        return this.re;
    }

    //Setters
    public void setReal(double re) {
        this.re = re;
    }

    public void setImaginary(double im) {
        this.im = im;
    }

    // Overriding toString() method of String class
    @Override
    public String toString() {
        return this.re + " + " + this.im + "i";
    }
}

public class p1 {

    public static void main(String[] args) {
        Complex1 c = new Complex1(5, 7);
        System.out.println(c);
    }

}
