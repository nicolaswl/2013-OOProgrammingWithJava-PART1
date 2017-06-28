
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a year: ");
        int year = Integer.parseInt(reader.nextLine());
        boolean isleapyear;
        isleapyear = (year % 4 == 0);
        isleapyear = isleapyear && (year % 100 != 0);
        isleapyear = isleapyear || (year % 400 == 0);
        if (isleapyear == true) {
            System.out.println("This year is a leap year.");
        }else {
            System.out.println("This year is not a leap year.");
        }
            

    }
}
