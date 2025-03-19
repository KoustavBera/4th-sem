package CSW_2.LAB_16;

public class p3_StringComparison {

    public static void main(String[] args) {
        String l1 = "xyz";
        String l2 = "xyz";
        System.out.println("Comparison of literal using ==");
        System.out.println(l1 == l2);
        String ob1 = new String("abc");
        String ob2 = new String("abc");
        System.out.println(ob1 == ob2);
    }
}
