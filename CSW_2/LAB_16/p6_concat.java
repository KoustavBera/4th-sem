package CSW_2.LAB_16;

public class p6_concat {

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "xyz";
        String s3 = s1.concat(s2);
        System.out.println(s3);
        System.out.println(s1.concat(null));
    }
}
