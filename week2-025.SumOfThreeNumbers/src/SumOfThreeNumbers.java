
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the first number: ");
        int read = Integer.parseInt(reader.nextLine());
        System.out.println("Type the second number: ");
        int sum = read + Integer.parseInt(reader.nextLine());
        System.out.println("Type the third number: ");
        sum = sum + Integer.parseInt(reader.nextLine());
        


        // Write your program here
        // Use only variables sum and read

        System.out.println("Sum: " + sum);
    }
}
