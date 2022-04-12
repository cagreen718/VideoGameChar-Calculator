
/**
 * Write a description of class ProduceItem here.
 *
 * @author (Carnell Greenfield III)
 * @version (10/2/21)
 */
//
 
 
import java.lang.Math;     //to allow the scanner and rounding
import java.util.Scanner;
 
 
public class VideoGameChar {
	
	protected String Name;
	protected double MaxHealth;
	protected double RemainingHealth;
	
	
	/*
	*Note: the empty constructor and worked on for 3 minutes.  
	*@param prepares for next constructor
	*@return nothing
	*/
public VideoGameChar() {
	Name= "";
	MaxHealth= 0.0;
	RemainingHealth= 0.0;
	}
/*
*Note: the filled constructor and worked on for 3 minutes.  
*@param sets and gets the variables 
*@returns Name, MaxHealth, RemainingHealth
*/
 
public VideoGameChar(String Name, double MaxHealth, double RemainingHealth) {
	this.Name= Name;
	this.MaxHealth= MaxHealth;
	this.RemainingHealth= RemainingHealth;
	
	}
/*
*Note: the this used to get a rounded version of the health. This took 2 mins because I found a feature on eclipse that adds this statements for you.
*/
 
public String getName() {
	return Name;
}
 
public void setName(String Name) {
	this.Name = Name;
}
 
public double getMaxHealth() {
	return MaxHealth;
}
 
public void setMaxHealth(double MaxHealth) {
	this.MaxHealth = (MaxHealth);
}
 
public double getRemainingHealth() {
	return RemainingHealth;
}
 
public void increaseHealth(double addedHealth) {
	RemainingHealth = (RemainingHealth + addedHealth);
}
	
 
	
	public void decreaseHealth(double subbedHealth) {
		RemainingHealth = (RemainingHealth - subbedHealth);
	}
		public void setRemainingHealth(double RemainingHealth) {
			this.RemainingHealth = (RemainingHealth);
	}
/*
*Note: worked on for an hour. The if statement for increasing remaining health. I am having alot of trouble getting it to be called in Driver which took an extra hour.
**@param takes percentages of the input as the iterations increase or decrease 
**@returns iteration 1-10 along with prompts stating the status of health
*/
 
 
			
			
/*
 * public String getHealthstring(){ double percentage= getHealthPercentage();
 * if(percentage<=0.0){ return Name +"'s Health all gone"; }else
 * if(percentage<=25.0){ return Name +"'s Health almost gone "+percentage; }else
 * if(percentage<=50.0){ return Name
 * +"'s Health is more than a quarter health remaining "+percentage; }else
 * if(percentage<=99.9){ return Name +"'s more than half health "+ percentage;
 * }else{ return Name +"'s Full health remaining  "; } }
 */
//
/*
*Note: worked on for an hour. The if statement for decreasing remaining health.
*/
 
 
 
 
 
 
/*
*Note: worked on for an forty minutes. The character name health and remaining health is print in the required format.
*@param prints the final variable values
*@return rounds each value to the tenth place
*/
		public String toString(){
			return Name +":  " + Math.round(getRemainingHealth()*10.0)/10.0 +" out of " + Math.round(getMaxHealth()*10.0)/10.0 +" health or " + Math.round(getHealthPercentage()*10.0) /10.0 + "%";
}
 
 
 
		public double getHealthPercentage() {
			 return (RemainingHealth/MaxHealth)*100.0;
		 }
		 
		 /*
		 *Note: My custom class that has its own function. for 10 minutes.
		 *@param   counting the letters of character name
		 *@return an integer of how many letters are in the name of the video game character
		 */
		 
			
			  public int getFindName(String Name) { 
				  return Name.length(); 
				  }
			 
		}
		 