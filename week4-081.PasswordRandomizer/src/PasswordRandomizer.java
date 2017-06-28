import java.util.Random;

public class PasswordRandomizer {
    private int length;
    private Random gen = new Random();
    
    public PasswordRandomizer(int length) {
        this.length = length;
    }

    public String createPassword() {
        int index = 0; 
        String password = "";
        for(int x = 0; x < length; x++) {
            index = gen.nextInt(26);
            password += "abcdefghijklmnopqrstuvwxyz".charAt(index);
        }
        return password;
    }
}
