import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        GradeBook grades = new GradeBook();
        
        System.out.println("Type exam scores, -1 completes: ");
        while(true) {
            int grade = reader.nextInt();
            if(grade == -1)
                break;
            grades.addGrade(new Score(grade));
        }
        
        System.out.println("Grade distribution: ");
        grades.gradeDistribution();
        
        System.out.println();
        System.out.println("Acceptance percentage: " + grades.acceptancePercentage());
    }
}
