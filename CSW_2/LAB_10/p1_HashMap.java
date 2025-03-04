package CSW_2.LAB_10;

import java.util.HashMap;
import java.util.Map;

public class p1_HashMap {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        //Inserting entries  in the Map using put() method
        map.put(10, "Radha");
        map.put(30, "Mohan");
        map.put(20, "Ananya");
        map.put(40, "Nutan");
        for (Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.print(e.getKey() + " " + e.getValue());
        }
    }
}
