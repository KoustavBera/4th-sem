package CSW_2.LAB_6;

import java.util.ArrayList;

public class typeSafetyExample {

    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        arr.add("Sunil");
        arr.add("Rabi");
        arr.add(73);

        String s1 = (String) arr.get(0);
        String s2 = (String) arr.get(1);

        String s3 = (String) arr.get(2);
        //run-time error because 73 is stored as object in generic ArrayList and it cannot be converted to integer
    }
}
