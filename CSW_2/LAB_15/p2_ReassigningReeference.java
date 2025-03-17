package CSW_2.LAB_15;

public class p2_ReassigningReeference {

    private String name;

    public p2_ReassigningReeference(String name) {
        this.name = name;
        System.out.println(name + " created.");

    }

    @Override
    protected void finalize() {
        System.out.println(name + " is garbage collected");
    }

    public static void main(String[] args) {
        p2_ReassigningReeference ob1 = new p2_ReassigningReeference("L1");
        p2_ReassigningReeference ob2 = new p2_ReassigningReeference("L2");

        //Reassign ob1 to ob2, making "L1" reachable
        ob1 = ob2;

        //Suggest Garbage Collection
        System.gc();

        //Adding a delay to allow GC to run 
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("End of main method");
    }
}
