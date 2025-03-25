package CSW_2.LAB_16;

public class p7_StringSplitting {

    public static void main(String[] args) {
        String str = "This is,comma fullstop whitespaces & etc. @xyz";
        String regex = "[,\\s\\&\\.\\@]";
        //s-> space
        String[] arr = str.split(regex);
        for (String x : arr) {
            System.out.println(x);
        }
    }
}
