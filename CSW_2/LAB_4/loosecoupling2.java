package CSW_2.LAB_4;

interface keyboard {

    String display();
}

class DellKeyboard implements keyboard {

    String info;

    public String display() {
        this.info = "the Dellkeyboard";
        return this.info;
    }
}

class LenovoKeyboard implements keyboard {

    String info;

    public String display() {
        this.info = "the Lenovo keyboard.";
        return this.info;
    }
}

class Computer {

    public void keyboardUsed(DellKeyboard dk) {
        System.out.println("The computer is using " + dk.display());
    }
}

public class loosecoupling2 {

    public static void main(String[] args) {
        Computer obj = new Computer();
        DellKeyboard dk = new DellKeyboard();
        obj.keyboardUsed(dk);
    }
}
