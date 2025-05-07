package LAB_25_ContinuationOfDate;

import java.time.ZoneId;
import java.util.Set;
import java.util.TreeSet;

public class p4_TimeZoneExchange {

    public static void main(String[] args) {
        Set<String> AllIds = ZoneId.getAvailableZoneIds();
        TreeSet<String> sortedIds = new TreeSet<>(AllIds);
        for (String s : sortedIds) {
            System.out.println(s);
        }
        System.out.println(sortedIds.size());

    }
}
