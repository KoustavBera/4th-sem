package CSW_2.LAB_10;

import java.util.Map;
import java.util.TreeMap;

public class p3_HashMap {

    public static void main(String[] args) {
        Map<String, Integer> tmap = new TreeMap<>();
        tmap.put("Vijay", 30);
        tmap.put("Aruna", 27);
        tmap.put("Bindu", 31);
        tmap.put("Modal", 21);
        System.out.println(tmap);
    }
}
