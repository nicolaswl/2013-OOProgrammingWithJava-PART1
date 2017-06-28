/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nicolas
 */
public class Counter {
    private int value;
    private boolean check;
    
    public Counter(int startingValue, boolean check) {
        value = startingValue;
        this.check = check;
    }
    
    public Counter(int startingValue) {
        this(startingValue, false);
    }
    
    public Counter(boolean check) {
        this(0, check);
    }
    
    public Counter() {
        this(0, false);
    }
    
    public int value() {
        return value;
    }
    
    public void increase() {
        value++;
    }
    
    public void decrease() {
        if(check && value == 0) {
            value = 0;
        } else {
            value--;
        }
    }
    
    public void increase(int increaseAmount) {
        if(increaseAmount >= 0) {
            value += increaseAmount;
        }
    }
    
    public void decrease(int decreaseAmount) {
        if(decreaseAmount >= 0) {
            if(check && ((value - decreaseAmount) <= 0)) {
                value = 0;
            } else {
                value -= decreaseAmount;
            }   
        }
    }
}
