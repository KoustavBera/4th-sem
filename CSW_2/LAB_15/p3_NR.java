package CSW_2.LAB_15;

public class p3_NR {
//Nullified Reference Var

    private String name;

    public p3_NR(String name) {
        this.name = name;
        System.out.println(name + " created.");

    }

    @Override
    protected void finalize() {
        System.out.println(name + " is garbage collected");
    }

    public static void main(String[] args) {
        p3_NR ob1 = new p3_NR("L1");
        p3_NR ob2 = new p3_NR("L2");

        ob1 = null;
        ob2 = null;       //Suggest Garbage Collection
        // after this we lost the address so the data is useless so it becomes useless memory
        System.gc(); // RUN THE GARBAGE COLLECTOR

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("End of main method");
    }
}
