
class MemoryDemo {

    private int intValue;

    private double doubleValue;

    // Constructor to initialize values
    public MemoryDemo(int intValue, double doubleValue) {

        this.intValue = intValue;

        this.doubleValue = doubleValue;

        System.out.println("Object created with int: " + intValue + ", double:" + doubleValue);

    }

    // Method to set values
    public void setValues(int intValue, double doubleValue) {

        this.intValue = intValue;

        this.doubleValue = doubleValue;

        System.out.println("Values updated to int: " + intValue + ", double:" + doubleValue);

    }

    // Overriding finalize() to detect garbage collection
    @Override

    @SuppressWarnings("FinalizeDoesntCallSuperFinalize")
    protected void finalize() throws Throwable {

        System.out.println("Object with int: " + intValue + " and double:" + doubleValue + " is garbage collected.");
    }

    public static void main(String[] args) {

        Runtime runtime = Runtime.getRuntime();
        printMemoryUsage(runtime, "Before object creation");
        // Checking initial memory usage printMemoryUsage (runtime, "Before object creation");
        // Creating objects
        MemoryDemo obj1 = new MemoryDemo(10, 20.5);
        MemoryDemo obj2 = new MemoryDemo(30, 40.7);

        // Modifying values
        obj1.setValues(50, 60.8);

        obj2.setValues(70, 80.9);

        // Checking memory after object creation printMemory Usage (runtime, "After object creation");
        // Making objects unreachable
        obj1 = null;

        obj2 = null;

        // Suggest garbage collection
        System.gc();

        // Adding a delay to allow GC to run
        try {

            Thread.sleep(2000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //Checking memory after garbage collection\
        printMemoryUsage(runtime, "After garbage collection");
    }

    private static void printMemoryUsage(Runtime runtime, String message) {
        System.out.println("\n" + message + ":");
        System.out.println("Total Memory (Heap Size): " + runtime.totalMemory() / (1024 * 1024) + "MB");
        System.out.println("Free Memory: " + runtime.freeMemory() / (1024 * 1024) + "MB");
        System.out.println("Used Memory: " + (runtime.totalMemory() - runtime.freeMemory()) / (1024 * 1024) + "MB");
    }
}
