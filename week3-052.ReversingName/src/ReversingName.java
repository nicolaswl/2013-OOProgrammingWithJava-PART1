import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        
        System.out.print("In reverse order: ");
        for(int x = name.length() - 1; x >= 0; x--) {
            System.out.print(name.charAt(x));
        }
    }
}
