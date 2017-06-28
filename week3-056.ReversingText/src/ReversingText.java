
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        String reverse = "";
        for(int x = text.length() - 1; x >= 0; x--) {
            reverse += text.charAt(x);
        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
