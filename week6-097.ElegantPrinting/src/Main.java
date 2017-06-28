
public class Main {

    public static void main(String[] args) {
        // test method here
        int[] array = {5, 1, 3, 4, 2};
        printElegantly(array);
    }

    public static void printElegantly(int[] array) {
        String printed = "";
        for(int x = 0; x < array.length; x++) {
            if(x == array.length - 1) {
                printed += array[x];
                break;
            }
            printed += array[x] + ", ";           
        }
        System.out.println(printed);
    }
}
