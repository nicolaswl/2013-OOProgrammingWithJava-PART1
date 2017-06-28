import java.util.ArrayList;

public class TheGreatest {
    public static int greatest(ArrayList<Integer> list) {
        int greatest = list.get(0);
        int greatestIndex = 0;
        for(int x = 1; x < list.size(); x++) {
            if(greatest < list.get(x)) {
                greatest = list.get(x);
                greatestIndex = x;
            }
        }
        return list.get(greatestIndex);
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(3);
        lista.add(2);
        lista.add(7);
        lista.add(2);
        
        System.out.println("The greatest number is: " + greatest(lista));
    }
}