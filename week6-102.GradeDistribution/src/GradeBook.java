/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nicolas
 */
import java.util.ArrayList;
public class GradeBook {
    private ArrayList<Score> scores;

    public GradeBook() {
        scores = new ArrayList<Score>();
    }
    
    public void addGrade(Score score) {
        if(score.getDistribution() != -1)
            scores.add(score);
    }
    
    public void gradeDistribution() {
        System.out.print("5: ");
        for(Score s: scores) {
            if(s.getDistribution() == 5)
                System.out.print("*");
        }
        System.out.println();
        System.out.print("4: ");
        for(Score s: scores) {
            if(s.getDistribution() == 4)
                System.out.print("*");
        }
        System.out.println();
        System.out.print("3: ");
        for(Score s: scores) {
            if(s.getDistribution() == 3)
                System.out.print("*");
        }
        System.out.println();
        System.out.print("2: ");
        for(Score s: scores) {
            if(s.getDistribution() == 2)
                System.out.print("*");
        }
        System.out.println();
        System.out.print("1: ");
        for(Score s: scores) {
            if(s.getDistribution() == 1)
                System.out.print("*");
        }
        System.out.println();
        System.out.print("0: ");
        for(Score s: scores) {
            if(s.getDistribution() == 0)
                System.out.print("*");
        }
    }
    
    public double acceptancePercentage() {
        int accepted = 0;
        for(Score s: scores) {
            if(s.getDistribution() != 0)
                accepted++;
        }
        return 100.0 * accepted / scores.size();
    }   
    
    
    
}
