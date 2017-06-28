
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
    }
    
    public static int smallest(int[] array) {
        int smallest = array[0];
        for(int x = 0; x < array.length; x++) {
            if(array[x] < smallest)
                smallest = array[x];
        }
        return smallest;
    }
    
    public static int indexOfTheSmallest(int[] array) {
        int smallest = array[0];
        int index = 0;
        for(int x = 0; x < array.length; x++) {
            if(array[x] < smallest) {
                smallest = array[x];
                index = x;
            }
        }
        return index;
    }
    
    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int smallest = array[index];
        int smallIndex = index;
        for(int x = index; x < array.length; x++) {
            if(array[x] < smallest) {
                smallest = array[x];
                smallIndex = x;
            }
        }
        return smallIndex;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    
    public static void sort(int[] array) {
        System.out.println(Arrays.toString(array));
        for(int currentIndex = 0; currentIndex < array.length; currentIndex++) {
            int smallestIndex = indexOfTheSmallestStartingFrom(array, currentIndex);
            swap(array, currentIndex, smallestIndex);
            System.out.println(Arrays.toString(array));
            
        }
        
        
    }
    
    
    

}
