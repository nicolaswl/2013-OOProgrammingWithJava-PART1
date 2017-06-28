import java.util.Scanner;
public class Main {  

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        BirdDatabase database = new BirdDatabase();
        
        while(true) {
            System.out.println("?");
            String command = reader.nextLine();
            
            if(command.equals("Add")) {
                System.out.println("Name: ");
                String name = reader.nextLine();
                System.out.println("Latin Name: ");
                String latinName = reader.nextLine();
                database.addBird(new Bird(name, latinName));
            } else if(command.equals("Observation")) {
                System.out.println("What was observed:? ");
                String bird = reader.nextLine();
                Bird b = database.search(bird);
                if( b != null) 
                    b.observation();
                else
                    System.out.println("Is not a bird!");
            } else if(command.equals("Statistics")) {
                System.out.println(database);
            } else if(command.equals("Show")) {
                System.out.println("What? ");
                String name = reader.nextLine();
                Bird b = database.search(name);
                if(b != null)
                    System.out.println(b);
                else
                    System.out.println("Is not a bird!");
                
            } else if(command.equals("Quit"))
                break;
        }
            
    }

}
