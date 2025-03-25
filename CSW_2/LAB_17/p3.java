package CSW_2.LAB_17;

public class p3 {

    public static void main(String[] args) {
        // string builder(not thread-safe) faster  than string buffer (thread-safe) 
        String str = "Hello";
        System.out.println(str);
        str.concat("2k3");
        System.out.println(str);
        str = str.concat("2k3");
        System.out.println(str);

    }
}
