import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        String reverse = reverse(text);
        if(text.equals(reverse)) {
            return true;
        }
        return false;
    }
    public static String reverse(String text) {
        String reverse = "";
        for(int x = text.length() - 1; x >= 0; x--) {
            reverse += text.charAt(x);
        }
        return reverse;
    }
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
