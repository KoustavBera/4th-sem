package CSW_2.LAB_15;

import java.util.ArrayList;
import java.util.List;

public class p6_MemoryIntensive {

    private static final int OBJECT_COUNT = 10000000; //adjust based on available memory
    private static List<byte[]> objectList = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Starting memory-Intensive Program....");

        for (int i = 0; i < 5; i++) { //run multiple cycles to trigger gc
            createObjects();
            printMemoryUsage();
            System.gc(); //request garbage collection
        }
        System.out.println("Program finished");
    }

    private static void createObjects() {
        System.out.println("\nCreating " + OBJECT_COUNT + " objects...");
        for (int i = 0; i < OBJECT_COUNT; i++) {
            //each object is 1kb (adjust to increase memory load)
            objectList.add(new byte[1024]);
        }
        System.out.println("objects created.");
    }

    public static void printMemoryUsage() {
        Runtime runtime = Runtime.getRuntime();
        long totalMemory = runtime.totalMemory();
        long freeMemory = runtime.freeMemory();
        long usedMemory = totalMemory - freeMemory;

        System.out.println("timestamp: " + System.currentTimeMillis());
        System.out.println("total memory (Heap size):" + totalMemory / (1024 * 1024) + " MB");
        System.out.println("free memory: " + freeMemory / (1024 * 1024) + " MB");
        System.out.println("used memory: " + usedMemory / (1024 * 1024) + " MB");
    }
}
