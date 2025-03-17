package CSW_2.LAB_15;

public class p4_AO {

    private String name;

    public p4_AO(String name) {
        this.name = name;
        System.out.println(name + " created.");
    }

    protected void finalize() throws Throwable {
        System.out.println(name + " is garbage collection");
    }

    //Method that creates an anonymous Object
    public static void createp4_AO() {
        new p4_AO("L1"); //No reference is stored, making it immediately eligible for GC 
    }

    public static void main(String[] args) {
        new p4_AO("L2");
        //Calling  method that creates another anonymous object
        createp4_AO();
        System.gc();
    }

}
