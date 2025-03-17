package CSW_2.LAB_14;

public class p6_EH {

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            int c = a / b;
            System.out.println(c);
        } catch (Exception x) {
            System.out.println(x.getMessage());
        }
    }
}
