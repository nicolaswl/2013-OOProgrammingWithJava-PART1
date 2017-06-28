
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int number = 101;
        int guesses = 0;
        
        while (number != numberDrawn) {
            System.out.println("Guess a number: ");
            number = Integer.parseInt(reader.nextLine());
            guesses++;
            if (numberDrawn < number) {
                System.out.println("The number is lesser, guesses made: " + guesses);
                
            }else if (numberDrawn > number) {
                System.out.println("The number is greater, guesses made: " + guesses);
            }
            
        
                  
        }
        System.out.println("Congratulations, your guess is correct!");
        

        // program your solution here. Do not touch the above lines!
        
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
