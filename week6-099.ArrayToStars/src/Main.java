
public class Main {

    public static void main(String[] args) {
        // test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayAsStars(array);
    }

    public static void printArrayAsStars(int[] array) {
        for(int x = 0; x < array.length; x++) {
            for(int y = 0; y < array[x]; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
