package CSW_2.LAB_4;

// Class for mathematical operations
class MathOperations {

    // method for adding two numbers
    public void addition(int a, int b) {
        int sum = a + b;
        System.out.println("Addition of the numbers " + a + " and " + b + " is: " + sum);
    }
}

// Class for linguistic operations
class LinguisticOperations {

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

public class cohesion2_highcohesion {

    public static void main(String args[]) {
        int a = 9;
        int b = 46;
        char c = 't';
        char d = 'o';

        // creating objects of the classes with cohesive responsibilities
        MathOperations mathObj = new MathOperations();
        LinguisticOperations lingObj = new LinguisticOperations();

        mathObj.addition(a, b);
        lingObj.findingVowel(c);
        lingObj.findingVowel(d);
    }
}
