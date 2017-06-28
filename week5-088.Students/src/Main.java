
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();
        
        while(true) {
            System.out.println("Name: ");
            String name = reader.nextLine();
            if(name.equals(""))
                break;
            System.out.println("studentnumber: ");
            String number = reader.nextLine();
            
            list.add(new Student(name, number));
        }
        
        for(Student s: list) {
            System.out.println(s);
        }
        
        System.out.println("Give search term: ");
        String term = reader.nextLine();
        
        System.out.println("Result: ");
        for(Student s: list) {
            if(s.getName().contains(term)) {
                System.out.println(s);
            }
        }
    }
}