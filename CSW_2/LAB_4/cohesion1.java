package CSW_2.LAB_4;

class LowCohesion1 {

    // method for adding two numbers
    public void addition(int a, int b) {
        int sum = a + b;
        System.out.println("Addition of the numbers " + a + " and " + b + " is: " + sum);
    }

    // method for checking the vowels and consonants
    public void findingVowel(char a) {
        switch (a) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(a + " is a vowel.");
                break;
            default:
                System.out.println(a + " is not a vowel.");
        }
    }
}

public class cohesion1 {

    public static void main(String args[]) {
        int a = 9;
        int b = 46;
        char c = 't';
        char d = 'o';

        // creating an object of the class LowCohesion1
        LowCohesion1 obj = new LowCohesion1();
        obj.addition(a, b);
        obj.findingVowel(c);
        obj.findingVowel(d);
    }
}
