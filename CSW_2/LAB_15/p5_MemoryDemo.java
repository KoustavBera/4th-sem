package CSW_2.LAB_15;

public class p5_MemoryDemo {

    private int intValue;
    private double doubleValue;

    // Constructor to initialise value
    public p5_MemoryDemo(int intValue, double doubleValue) {
        this.intValue = intValue;
        this.doubleValue = doubleValue;
        System.out.println("Object created with int: " + intValue + ", double: " + doubleValue);
    }

    // Method to modify object values
    public void setValues(int intValue, double doubleValue) {
        this.intValue = intValue;
        this.doubleValue = doubleValue;
        System.out.println("Values updated to int: " + intValue + ", double: " + doubleValue);
    }

    // finalize method to track garbage collection
    protected void finalize() throws Throwable {
        System.out.println("Object with int: " + intValue + " and double: " + doubleValue + " is garbage collected.");
    }

    // Method to print memory usage
    public static void printMemoryUsage(Runtime runtime, String phase) {
        long totalMemory = runtime.totalMemory();
        long freeMemory = runtime.freeMemory();
        long usedMemory = totalMemory - freeMemory;

        System.out.println("\nMemory Usage " + phase + ":");
        System.out.println("Total Memory: " + totalMemory + " bytes");
        System.out.println("Free Memory: " + freeMemory + " bytes");
        System.out.println("Used Memory: " + usedMemory + " bytes\n");
    }

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();

        // Checking initial memory usage
        printMemoryUsage(runtime, "Before object creation");

        // Creating objects
        p5_MemoryDemo ob1 = new p5_MemoryDemo(10, 20.5);
        p5_MemoryDemo ob2 = new p5_MemoryDemo(30, 40.7);

        // Modifying values
        ob1.setValues(50, 60.8);
        ob1.setValues(70, 80.9);  // Assuming this was intended to modify with different values

        // Making objects unreachable
        ob1 = null;
        ob2 = null;

        // Suggest garbage collection
        System.gc();

        // Allow some time for GC to complete (optional, for demonstration)
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Checking memory after garbage collection
        printMemoryUsage(runtime, "After garbage collection");
    }
}
