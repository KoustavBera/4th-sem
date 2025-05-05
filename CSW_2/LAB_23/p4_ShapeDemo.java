package CSW_2.LAB_23;

interface Shape {

    double area();

    default void printArea() {
        System.out.println("Area " + area());
    }
}

public class p4_ShapeDemo {

    public static void main(String[] args) {
        double radius = 4.5;
        double side = 3.7;
        double length = 6.7;
        double breadth = 2.8;
        Shape circle = () -> Math.PI * radius * radius;
        Shape square = () -> side * side;
        Shape Rectangle = () -> length * breadth;
        System.out.println("circle");
        circle.printArea();
        System.out.println("square");
        square.printArea();
        System.out.println("Rectangle");
        Rectangle.printArea();
    }
}
