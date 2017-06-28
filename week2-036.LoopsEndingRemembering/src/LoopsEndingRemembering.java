import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int remainder =0;
        int even = 0;
        int odd = 0;
        System.out.println("Type numbers: ");
        while (true) {
            int number = Integer.parseInt(reader.nextLine());
            remainder = number % 2;
            if (remainder == 0 && number != -1) {
                even++;
            }else if (number != -1) {
                odd++;
            }
            if (number != -1) {
                sum = sum + number;
                count++;
            }
                        
            if (number == -1) {
                System.out.println("Thank you and see you later!");
                System.out.println("The sum is " + sum);
                System.out.println("How many numbers: " + count);
                System.out.println("Average: " + ((sum * 1.0) / count));
                System.out.println("Even numbers: " + even);
                System.out.println("Odd numbers: " + odd);
                break;
            }
        }

    }
}
