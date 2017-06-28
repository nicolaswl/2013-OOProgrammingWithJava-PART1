
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);
        
        System.out.print("seconds: ");
        int s = reader.nextInt();
        System.out.print("minutes: ");
        int m = reader.nextInt();
        System.out.print("hours: ");
        int h = reader.nextInt();

        seconds.setValue(s);
        minutes.setValue(m);
        hours.setValue(h);
        
        int i = 0;
        while ( i < 121 ) {
            System.out.println( hours + ":" + minutes + ":" + seconds);   // the current time printed
            if(seconds.getValue() == 59) {
                seconds.next();
                
                if(minutes.getValue() == 59) {
                    minutes.next();
                    hours.next();
                } else {
                    minutes.next();
                }
                
            } else {
                seconds.next();
            }
            
            i++;
        }
    }
}
