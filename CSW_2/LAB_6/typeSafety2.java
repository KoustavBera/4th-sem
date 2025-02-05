package CSW_2.LAB_6;

import java.util.ArrayList;

public class typeSafety2 {

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Sunil");
        arr.add("Rabi");

        String s1 = arr.get(0);
        String s2 = arr.get(1);

        System.out.println(s2 + "," + s1);
    }
}
