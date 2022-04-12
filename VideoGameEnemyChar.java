
/**
/ * Write a description of class Enemy here.
 *
 * @author (Carnell Greenfield III)
 * @version (10/2/21)
 */
//
 
 import java.lang.Math;     //to allow the scanner and rounding
import java.util.Scanner;
 
 
public class VideoGameEnemyChar extends VideoGameChar {
 
   
    public VideoGameEnemyChar(){
       
    }
   
    public VideoGameEnemyChar(String Name, double MaxHealth, double RemainingHealth){
        super(Name,MaxHealth,RemainingHealth);
 
    }
    
    
    
    public String toString(){
       return ("Enemy ")+getName() +":  " + Math.round(getRemainingHealth()*10.0)/10.0 +" out of " + Math.round(getMaxHealth()*10.0)/10.0 +" health or " + Math.round(getHealthPercentage()*10.0) /10.0 + "%";
    }
}
 
 