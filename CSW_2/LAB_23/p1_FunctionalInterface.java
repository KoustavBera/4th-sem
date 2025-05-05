
public class p1_FunctionalInterface {

    interface Greeting {

        void sayHello(String name);
    }

    public class FI {

        public static void main(String[] args) {
            Greeting greet = (name) -> System.out.println("Hello" + name);
            greet.sayHello("Meera");
        }
    }
}
