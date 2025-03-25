package CSW_2.LAB_16;

public class p4_StringConcatenation {

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "There!";
        String s3 = s1 + s2;
        System.out.println(s3);
        String s5 = 50 + "yy" + 50;
        System.out.println("My weight is " + 80);
        System.out.println("xyz" + null); // Null Pointer excep
        System.out.println(s1.concat(50)); // exception
    }
}
