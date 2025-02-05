package CSW_2.LAB_6;

public class Generic_Method1 {

    static <T> void genericShow(T element) {
        System.out.println(element.getClass().getName() + "=" + element);
    }

    public static void main(String[] args) {
        genericShow(15);
        genericShow("Hello");
        genericShow(17.71);
        genericShow(17.71f);

    }
}
