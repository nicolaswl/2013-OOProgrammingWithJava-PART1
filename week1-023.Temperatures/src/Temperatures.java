
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        while (true) {
            System.out.println("Give temperature between -30 and 40 or type 100 to quit: ");
            double temperature = Double.parseDouble(reader.nextLine());
            if (temperature == 100) {
                break;
            }
            if (temperature > -30 && temperature < 40) {
                Graph.addNumber(temperature);
            }else {
                System.out.println("Out of range");
            }
            
        }  
        // Write your code here. 

        
    }
}