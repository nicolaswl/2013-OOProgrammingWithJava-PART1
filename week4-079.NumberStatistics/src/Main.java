import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        NumberStatistics n = new NumberStatistics();
        NumberStatistics nEven = new NumberStatistics();
        NumberStatistics nOdd = new NumberStatistics();
        
        System.out.println("Type numbers: ");
        while(true) {
            int num = reader.nextInt();
            if(num != -1) {
                if(num % 2 == 0) {
                    nEven.addNumber(num);
                } else {
                    nOdd.addNumber(num);
                }
                n.addNumber(num);
            } else 
                break;
        }
        System.out.println("Sum: " + n.sum());
        System.out.println("Sum of even: " + nEven.sum());
        System.out.println("Sum of odd: " + nOdd.sum());
    }
}
