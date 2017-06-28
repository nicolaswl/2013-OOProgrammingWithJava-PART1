import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        
        while(true) {
            System.out.println("Type a word: ");
            String word = reader.nextLine();
            if(word.equals("")) {
                 break;
            }
            words.add(word);
        }
        
        System.out.println("You typed the following words: ");
        for(int x = words.size() - 1; x >= 0; x--) {
            System.out.println(words.get(x));
        }
        
    }
}
