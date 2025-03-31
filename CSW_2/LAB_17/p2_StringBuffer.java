
public class p2_StringBuffer {

    public static void main(String[] args) {
        //initiL content "HellowSection2K3"
        StringBuffer sb = new StringBuffer("HellowSectionK3");
        System.out.println("Initial StringBuffer: " + sb);

        //1. Append a string to the StringBuffer
        sb.append(" is awesome!");
        System.out.println("After append: " + sb);

        //2. Insert a substring at a specific position 
        sb.insert(13, "Java");
        System.out.println("After append" + sb);

        //3. Replace a substring with another string
        sb.replace(0, 3, "Welcome to");

        //4. Delete a substring from the StringBuiler
        sb.delete(8, 14);
        System.out.println("After delete : " + sb);

        //5. Reverse the content of the StringBuffer
        sb.reverse();

        //6. get the current capacity of the stringBuffer
        int capacity = sb.capacity();
        System.out.println("Current capacity " + (capacity));

        // 7. Get the length of the StringBuffer
        int length = sb.length();
        System.out.println("Current length: " + length);
// 8. Access a character at a specific index 

        char charAt5 = sb.charAt(5);
        System.out.println("Character at index 5: " + charAt5);
// 9. Set a character at a specific index

        sb.setCharAt(5, 'X');
        System.out.println("After setCharAt: " + sb);
// 10. Get a substring from the StringBuffer 

        String substring = sb.substring(5, 10);
        System.out.println("Substring (5 to 10): " + substring);
// 11. Find the index of a specific substring

        sb.reverse(); // Reversing back to original order for search
        int indexOfGeeks = sb.indexOf("Geeks");
        System.out.println("Index of 'Geeks': " + indexOfGeeks);
// 12. Delete a character at a specific index

        sb.deleteCharAt(5);
        System.out.println("After deleteCharAt: " + sb);

        //13. conveert the String Buildr to a string
        System.out.println("Final String " + sb.toString());
    }
}
