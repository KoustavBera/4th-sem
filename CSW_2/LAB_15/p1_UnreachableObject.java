package CSW_2.LAB_15;
//GarbageCollection

public class p1_UnreachableObject {

    private String name;

    public p1_UnreachableObject(String name) {
        this.name = name;
        System.out.println(name + " created.");
    }

    public static void show() {
        p1_UnreachableObject obj1 = new p1_UnreachableObject("L1");
        obj1.display();
    }

    public void display() {
        p1_UnreachableObject obj2 = new p1_UnreachableObject("L2");
        //objOL2 goes out og scope when this method ends, making it reachable
    }

    protected void finalize() throws Throwable {
        System.out.println(name + " is garbage collected.");
    }

    public static void main(String[] args) {
        //Call show() which creates objects
        p1_UnreachableObject.show();
        //Suggest garbage collection
        System.gc();

        //Adding a delay to ensure GC has time to collect objects
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("End of main method");
        }
    }
}
