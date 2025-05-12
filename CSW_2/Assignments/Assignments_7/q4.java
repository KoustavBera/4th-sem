interface Shape {
	double area();

	default void printArea() {
		System.out.println("area: " + area());
	}
}

public class q4 {
	public static void main(String[] args) {
		double r = 3, l = 3, b = 3;
		Shape circle = () -> Math.PI * r * r;
		Shape rectangle = () -> l * b;
		Shape square = () -> l * l;
		System.out.println("Area of circle");
		circle.printArea();
		System.out.println("Area of rectangle");
		rectangle.printArea();
		System.out.println("Area of square");
		square.printArea();

	}
}
