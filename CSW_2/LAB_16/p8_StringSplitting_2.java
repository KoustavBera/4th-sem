package CSW_2.LAB_16;

public class p8_StringSplitting_2 {

    public static void main(String[] args) {
        String s = "Hi@How@are@you@!";
        String[] arr = s.split("@", 3);
        for (String x : arr) {
            System.out.println(x);
        }
    }
}
