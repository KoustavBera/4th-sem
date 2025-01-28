
public class encapsulation2 {

    public static void main(String[] args) {
        Area rect = new Area(10, 4, 5);
        rect.getArea();
        rect.getAreaOfCircle();
    }
}

class Area {

    private int l;
    private int b;
    private int r;

    Area(int l, int b, int r) {
        this.l = l;
        this.b = b;
        this.r = r;
    }

    public void getArea() {
        int area = l * b;
        System.out.println("Area " + area);
    }

    public void getAreaOfCircle() {
        int area = (int) (Math.PI * r * r);
        System.out.println("Area of circle " + area);
    }
}
