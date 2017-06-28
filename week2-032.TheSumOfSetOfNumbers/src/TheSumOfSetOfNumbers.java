
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Until what? ");
        int last = Integer.parseInt(reader.nextLine());
        int loops = 0;
        int sum = 0;
        while (loops < last) {
            loops++;
            sum = sum + loops;  
                    
        }
        System.out.println("The sum is " + sum);

    }
}
