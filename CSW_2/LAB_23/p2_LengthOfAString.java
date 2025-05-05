package CSW_2.LAB_23;

interface StringLength {

    int calculate(String input);
}

public class p2_LengthOfAString {

    public static void main(String[] args) {
        StringLength findLength = (str) -> str.length();
        String l1 = "Hello";
        String l2 = "How are you";
        int len1 = findLength.calculate(l1);
        int len2 = findLength.calculate(l2);
        System.out.println("Length 1" + len1);
        System.out.println("Length 2" + len1);
    }
}
