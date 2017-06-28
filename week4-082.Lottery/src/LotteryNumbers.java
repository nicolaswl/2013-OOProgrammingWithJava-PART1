import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random gen = new Random();
    
    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        int x = 0;   
        int num = 0;
        while(x < 7) {
            num = gen.nextInt(39) + 1;
            if(!containsNumber(num)) {
                 numbers.add(num);
                 x++;
            }
           
        }
    }

    public boolean containsNumber(int number) {
        return numbers.contains(number);
    }
}
