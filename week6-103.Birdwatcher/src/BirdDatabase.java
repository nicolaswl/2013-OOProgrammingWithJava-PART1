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
public class BirdDatabase {
    private ArrayList<Bird> database;

    public BirdDatabase() {
        database = new ArrayList<Bird>();
    }
    
    public void addBird(Bird b) {
        database.add(b);
    }
    
    public Bird search(String name) {
        for(Bird b: database) {
            if(b.getName().contains(name))
                return b;
        }
           
        return null;
        
    }
   
    public String toString() {
        String s = "";
        for(Bird b: database) {
            s += b + "\n";
        }
        return s;
    }
    
    
}
