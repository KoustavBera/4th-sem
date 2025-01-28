
public class abstraction {

    public static void main(String[] args) {
        shape r = new Rectangle();
        r.draw();
        shape c = new circle();
        c.draw();
    }

}

abstract class shape {

    abstract void draw();
}

class Rectangle extends shape {

    void draw() {
        System.out.println("Drawing Rectangle");
    }

}

class circle extends shape {

    void draw() {
        System.out.println("Drawing circle");
    }
}
