
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        System.out.print("Type your age: ");
        int age = Integer.parseInt(reader.nextLine());
        
        System.out.print("Type your name: ");
        String secondname = reader.nextLine();
        System.out.println("Type your age: ");
        int secondage = Integer.parseInt(reader.nextLine());
        
        System.out.println(name + " and " + secondname + " are " + (age + secondage) + " in total.");

        // Implement your program here
    }
}
