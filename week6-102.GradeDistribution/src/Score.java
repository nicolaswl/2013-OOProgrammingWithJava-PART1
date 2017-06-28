/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nicolas
 */
public class Score {
    private int score;
    private int distribution; 

    public Score(int score) {
        this.score = score;
        
        
        if(score <= 29 && score >= 0) {
            distribution = 0;
        }else if(score >= 30 && score <= 34) {
            distribution = 1;
        }else if(score >= 35 && score <= 39) {
            distribution = 2;
        }else if(score >= 40 && score <= 44) {
            distribution = 3;
        }else if(score >= 45 && score <= 49) {
            distribution = 4;
        }else if(score >= 50 && score <= 60) {
            distribution = 5;
        } else {
            distribution = -1;
        } 
    }

    public int getDistribution() {
        return distribution;
    }
    
    
    
    
}
