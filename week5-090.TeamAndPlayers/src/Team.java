/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Computer
 */
import java.util.ArrayList;
import java.util.Collections;
public class Team {
    private String name;
    private ArrayList<Player> members;
    private int maxsize;
    
    public Team(String name){
        this.name=name;
        this.members=new ArrayList<Player>();
        this.maxsize=16;
    }
    public String getName(){
        return name;
    }
    public void addPlayer(Player player){
        if (members.size()<maxsize){    
            this.members.add(player);
        }
    }
    public void printPlayers(){
        for(Player pl : members){   
            System.out.println(pl);
        }
    }
    public void setMaxSize(int maxSize){    
        this.maxsize=maxSize;
    }
    public int size(){
        return members.size();
    }
    public int goals(){
        int ng=0;
        for(Player pl : members){   
            ng+=pl.goals();
        }return ng;
    }
}
