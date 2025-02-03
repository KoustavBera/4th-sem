package CSW_2.LAB_3;

interface Add {

    int add(int a, int b);
}

interface Sub {

    int sub(int a, int b);
}



class calculation implements Add, Sub {

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }
}

public class interface1 {

    public static void main(String[] args) {
        calculation c = new calculation();
        System.out.println(c.add(9, 5));
        System.out.println(c.sub(9, 5));
    }
}
