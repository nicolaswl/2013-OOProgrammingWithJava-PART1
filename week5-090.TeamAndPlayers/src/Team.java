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
public class Team {
    private String name;
    private ArrayList<Player> players;
    private int maxSize;
    
    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<Player>();
        this.maxSize = 16;
    }

    public String getName() {
        return name;
    }
    
    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }
    
    public int size() {
        return players.size();
    }
    
    public void addPlayer(Player p) {
        if(players.size() < maxSize)
            players.add(p);
    } 
    
    public int goals() {
        int total = 0;
        for(Player p: players) {
            total += p.goals();
        }
        return total;
    }
    
    public void printPlayers() {
        for(Player p: players) {
            System.out.println(p);
        }
    }
}
