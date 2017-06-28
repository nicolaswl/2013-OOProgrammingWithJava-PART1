
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        
        int result = 0;
        int loops = 0;
        
        while (loops <= number) {
            result += (int)Math.pow(2, loops); // result = result + 2^loops
            loops++;
        }
        System.out.println("The result is " + result);

    }
}
