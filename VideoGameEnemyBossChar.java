
/**
/ * Write a description of class Video Game Boss here.
 *
 * @author (Carnell Greenfield III)
 * @version (10/2/21)
 */
//
 
 
import java.lang.Math;     //to allow the scanner and rounding
import java.util.Scanner;
 
 
public class VideoGameEnemyBossChar extends VideoGameChar{
	private int lives;
  
	public VideoGameEnemyBossChar(){
    	Name="";
    	RemainingHealth=0.0;
    	MaxHealth=0.0;
    	lives=0;
 	
	}
  
	public VideoGameEnemyBossChar(String Name,double MaxHealth,double RemainingHealth,int lives){
        super(Name,MaxHealth,RemainingHealth);
        this.lives=lives;
}
 
 
	public int getlives(){
    	return lives;
}
 
	public void setlives(int lives){
        this.lives=lives;
	}
  
	
  
   public String toString(){
	   return "Enemy Boss "+getName() +":  " + Math.round(getRemainingHealth()*10.0)/10.0 +" out of " + Math.round(getMaxHealth()*10.0)/10.0 +" health or " + Math.round(getHealthPercentage()*10.0) /10.0 + " % and "+lives+" lives left";
  	 
	}
}
 
