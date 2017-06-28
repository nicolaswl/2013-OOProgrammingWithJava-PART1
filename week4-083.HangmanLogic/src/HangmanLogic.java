
public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        // program here the functionality for making a guess
        if(!guessedLetters.contains(letter)) {
            if(word.contains(letter)) {
                guessedLetters += letter; 
            } else {             
                numberOfFaults++;
                guessedLetters += letter; 
            }                     
        }         
    }

    public String hiddenWord() {
        String hiddenWord = "";
        String letter = "";
        for(int x = 0; x < word.length(); x++) {
            letter = "" + word.charAt(x);
            if(guessedLetters.contains(letter)) {
                hiddenWord += letter;
            } else {
                hiddenWord += "_";
            }            
        }
       
        return hiddenWord;
    }
}
