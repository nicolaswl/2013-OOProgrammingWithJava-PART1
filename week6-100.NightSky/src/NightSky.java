/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nicolas
 */
import java.util.Random;
public class NightSky {
    private double density;
    private int width;
    private int height;
    // private Random gen = new Random();
    private int starsInLastPrint;

    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
    }
    
    public NightSky(int width, int height) {
        this(0.1, width, height);
    }
    
    public NightSky(double density) {
        this(density, 20, 10);
    }
    
    public int starsInLastPrint() {
        int temp = starsInLastPrint;
        starsInLastPrint = 0;
        return temp;
    }
    
    public void printLine() {
        String[] line = new String[width];
        Random gen = new Random();
        double probability;
        for(int x = 0; x < line.length; x++) {
            probability = gen.nextDouble();
            if(probability > density) 
                line[x] = " ";
            else {
                line[x] = "*";
                starsInLastPrint++;
            }
        }
        for(String s: line)
            System.out.print(s);
    }
    
    public void print() {
        for(int x = 0; x < height; x++) {
            printLine();
            System.out.println();
        }
    }
    
    
}
