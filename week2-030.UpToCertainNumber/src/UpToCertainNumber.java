
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Up to what number? ");
        int input = Integer.parseInt(reader.nextLine());
        int number = 0;
        while (number < input) {
            number++;
            System.out.println(number);
                    
        }
        
        // Write your code here
        
    }
}
