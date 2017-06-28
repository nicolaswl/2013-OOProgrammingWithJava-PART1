import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        
        for(int x = 0; x < 3; x++) {
            if(name.length() < 3)
                break;
            System.out.println((x+1) + "." + " character: " + name.charAt(x));
        }
    }
}
