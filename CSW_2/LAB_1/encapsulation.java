
public class encapsulation {

    private String name;
    private int age;

    // name getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//---------------------------------

    // age getter
    public int getAge() {
        return age;
    }

    //age setter
    public void setAge(int age) {
        this.age = age;
    }

}

@SuppressWarnings("unused")
class programmer {

    public static void main(String[] args) {
        encapsulation obj = new encapsulation();
        obj.setName("Ammar");
        obj.setAge(10);
        System.out.println("my name is " + obj.getName());
        System.out.println("my age is " + obj.getAge());
    }
}
