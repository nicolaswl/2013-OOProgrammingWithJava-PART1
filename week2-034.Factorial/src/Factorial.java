import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        
        int factorial = 1;
        int loops = 1;
        
        while (loops <= number) {
            factorial *= (loops); //factorial = factorial * loops
            loops++;
            if (number == 0) {
                System.out.println("Factorial is 1");
            }
            
        }
        System.out.println("Factorial is " + factorial);
        

    }
}
