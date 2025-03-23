// You are given a string containing alphanumeric characters, and your task is to design a 
// Java program that extracts and displays the numeric characters from the given string. If 
// no numeric characters are present, the program should display an appropriate message 
// indicating their absence. Additionally, if the input string is null or empty, the program 
// must throw a NullPointerException with a meaningful error message. 
import java.util.Scanner;
class q1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an alphanumeric string: ");
        String s = sc.nextLine();
        try{
            String n=extractno(s);
            if (n.length() == 0) {
                System.out.println("No numeric characters found in the input string.");
            } else {
                System.out.println("Extracted numbers: " + n);
            }
        }
        catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
       
    }
    public static String extractno(String s){
       if(s.length()==0){
          throw new NullPointerException("String must not be empty");
       }
       String n="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='0'&& s.charAt(i)<='9')
            n+=s.charAt(i);
        }
       return  n;
    }
}
        
