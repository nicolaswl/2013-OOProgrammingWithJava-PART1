
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        System.out.print("Type another number: ");
        int secondnumber = Integer.parseInt(reader.nextLine());
        System.out.println("Division: " + number + " / " + secondnumber + " = " + (number * 1.0/secondnumber));

        // Implement your program here. Remember to ask the input from user.
    }
}
