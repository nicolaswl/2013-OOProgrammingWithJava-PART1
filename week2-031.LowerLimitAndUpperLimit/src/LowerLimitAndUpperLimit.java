
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("First: ");
        int first = Integer.parseInt(reader.nextLine());
        System.out.println("Last: ");
        int last = Integer.parseInt(reader.nextLine());
        first--;
        while (first < last) {
            first++;
            System.out.println(first);
            if (first == last) {
                break;
            }
        }

        // write your code here

    }
}
