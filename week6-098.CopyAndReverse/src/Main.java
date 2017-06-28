
import java.util.Arrays;
public class Main {

   public static void main(String[] args) {
    int[] original = {1, 2, 3, 4};
    int[] reverse = reverseCopy(original);

    // print both
    System.out.println( "original: " +Arrays.toString(original));
    System.out.println( "reversed: " +Arrays.toString(reverse));
    }
      
    
    public static int[] copy(int[] array) {
        int[] copy = new int[array.length];
        for(int x = 0; x < array.length; x++) 
            copy[x] = array[x];
        return copy;
    }
    
    public static int[] reverseCopy(int[] array) {
        int[] copy = new int[array.length];
        int counter = 0;
        for(int x = array.length - 1; x >= 0; x--) {
            copy[counter] = array[x];
            counter++;
        }
        return copy;
    }
    
}
