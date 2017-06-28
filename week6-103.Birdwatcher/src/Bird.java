/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nicolas
 */
public class Bird {
    private String name;
    private String latinName;
    private int observationCounter;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observationCounter = 0;
    }

    public String getName() {
        return name;
    }
       
    public void observation() {
        observationCounter++;
    }
    
    public String toString() {
        return name + "(" + latinName + "): " + observationCounter + "observations";
    }
}
