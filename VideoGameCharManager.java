
import java.util.ArrayList;
 
import java.util.Scanner;
public class VideoGameCharManager{
    public static void main(String[] args) {
        Scanner stdinScanner;
        stdinScanner=new Scanner(System.in);
//        VideoGameCharManager character= new VideoGameCharManager();
          ArrayList<VideoGameChar> people=new ArrayList<VideoGameChar>();
        System.out.println("Welcome to your VideoGameChar Manager to store all of the video game characters");
        
        
        System.out.println("Please choose from the above options:");
        
       
        boolean success=true;
        while(success){
        	System.out.println("\nOptions:");
        	System.out.println("1) Add a human character");
            System.out.println("2) Add an enemy character");
            System.out.println("3) Add an enemy boss character");
            System.out.println("4) Display a character");
            System.out.println("5) Display all characters");
            System.out.println("6) Remove a character");
            System.out.println("7) Increase a character's health");
            System.out.println("8) Decrease a character's health");
            System.out.println("9) Quit");
            System.out.println("\nPlease choose from the above options: ");
            
            
            
			
            
       
			 
            String prompt=stdinScanner.next();
            if(prompt.equals("1")){
                System.out.println("You entered:"+prompt);
                
                System.out.println("Please enter the name of the character: ");
                String Name= stdinScanner.next();
                System.out.println("You entered: " + Name);
                
                
                
                System.out.println("Please enter the " + Name + "'s max heatlh: ");
                double MaxHealth=stdinScanner.nextDouble();
                System.out.println("You entered: " + MaxHealth);
                
                
                System.out.println("Please enter "+ Name + "'s remaining health:");
                double RemainingHealth=stdinScanner.nextDouble();             
                System.out.println("You entered: " + RemainingHealth);
                
                System.out.println("Please enter the number of coins for "+Name+":");
                int coins=stdinScanner.nextInt();
                System.out.println("You entered:"+coins);
                
                VideoGameHumanChar character= new VideoGameHumanChar(Name,MaxHealth,RemainingHealth,coins);
//                character.setcoins(coins);
//                character.setName(Name);
//                character.setRemainingHealth(RemainingHealth);
  //              character.setMaxHealth(MaxHealth);
                people.add(character);
            
            }
 
       
            else if(prompt.equals("2")){
                System.out.println("You entered:"+prompt);
                VideoGameEnemyChar character= new VideoGameEnemyChar();
                
                System.out.println("Please enter the name of the enemy character: ");
                String Name= stdinScanner.next();
                System.out.println("You entered: " + Name);
                
    
                
                   
                System.out.println("Please enter the "+Name+ "'s max heatlh: ");
                double MaxHealth=stdinScanner.nextDouble(); 
                
                character.setMaxHealth(MaxHealth);
                System.out.println("You entered: " + MaxHealth);
                System.out.println("Please enter "+ Name + "'s remaining health:");
                double RemainingHealth=stdinScanner.nextDouble();
                
                System.out.println("You entered: " + RemainingHealth);
                
//                VideoGameEnemyChar character= new VideoGameEnemyChar(Name,RemainingHealth,MaxHealth);              
                character.setName(Name);
//                character.setMaxHealth(MaxHealth);
                character.setRemainingHealth(RemainingHealth);
                people.add(character);
             
        }
                            
 
        else if(prompt.equals("3")){
            System.out.println("You entered:"+prompt);
            VideoGameEnemyBossChar character= new VideoGameEnemyBossChar();
            System.out.println("Please enter the name of the enemy boss character: ");
            String Name= stdinScanner.next();
            System.out.println("You entered: " + Name);
           
            
            System.out.println("Please enter the " + Name + "'s max heatlh: ");
            double MaxHealth=stdinScanner.nextDouble();
            System.out.println("You entered: " + MaxHealth);
            
         
         
         
            System.out.println("Please enter "+ Name + "'s remaining health:");
            double RemainingHealth=stdinScanner.nextDouble();            
            System.out.println("You entered: " + RemainingHealth);
            
            
            System.out.println("Please enter the number of lives for the Enemy boss:");
            int lives=stdinScanner.nextInt();
       //     System.out.println("You entered:"+lives);
            
//            VideoGameEnemyBossChar character3= new VideoGameEnemyBossChar(Name,RemainingHealth,MaxHealth,lives);
            character.setName(Name);
            character.setMaxHealth(MaxHealth);
            character.setRemainingHealth(RemainingHealth);
            character.setlives(lives);
            people.add(character);
            
            
            
           
                            
        }
        
        
		
        else if(prompt.equals("4")){ 
		  System.out.println("You entered:"+prompt);
		  
		  System.out.println("Please enter the name of the character to display: "); 
		  String Name=stdinScanner.next(); 
		  System.out.println("You entered: " + Name);
		  boolean fullChar=false;
		  for(int disChar=0;disChar<people.size();++disChar){
			  if(Name.equals(people.get(disChar).getName())) {
				  fullChar=true;
				  System.out.println(people.get(disChar));
		
			  }
		  
		  }
		  
		  if(fullChar==false) {
			  System.out.println("could not find");
		  }
		  
		  
		  }
		  
        else if(prompt.equals("5")){ 
			  System.out.println("You entered:"+prompt);
			  boolean altChar=false;
			  Integer peoples=people.size();
			  System.out.println("Displaying "+peoples+" characters: "); 
			   for(int allChar=0;allChar<peoples;++allChar) {
				  System.out.println(people.get(allChar));
		  }
	} 
		  
		
         
          
         
        else if(prompt.equals("6")){
             System.out.println("You entered:"+prompt);
             boolean remoChar=false;
             System.out.println("Please enter the name of the character to remove: ");
             String Name= stdinScanner.next();
             System.out.println("You entered: " + Name);
             	for(int reChar=0;reChar<people.size();++reChar) {
             		if(Name.equals(people.get(reChar).getName())) {
             			remoChar=true;
             			System.out.println("Removing:");
             			System.out.println(people.get(reChar));
             			people.remove(reChar);
             			
             		}
             	}
             	if(remoChar==false) {
         	 		System.out.println("Sorry, could not find "+Name+" in the list");
         }
         }
 
        else if(prompt.equals("7")){
            System.out.println("You entered:"+prompt);
             boolean addChar=false;
             System.out.println("Please enter the name of the character to increase health: ");
             String Name= stdinScanner.next();
             System.out.println("You entered: " + Name);
             	for(int Charcadd=0; Charcadd<people.size();++Charcadd) {
             		if(Name.equals(people.get(Charcadd).getName())) {
             			addChar=true;
             			System.out.println("Please enter the amount to increase health:");
                        double increHealth=stdinScanner.nextDouble();
                        System.out.println("You entered "+increHealth);
                        people.get(Charcadd).increaseHealth(increHealth);
             		}
             	}
             	 	if(addChar==false) {
             	 		System.out.println("Sorry, could not find "+Name+" in the list");
         
             	}
            
             
                
                
         }
       
        
        
        else if(prompt.equals("8")){
        	 System.out.println("You entered:"+prompt);
             boolean subChar=false;
             System.out.println("Please enter the name of the character to decrease health: ");
             String Name= stdinScanner.next();
             System.out.println("You entered: " + Name);
             	for(int Charcsub=0; Charcsub<people.size();++Charcsub) {
             		if(Name.equals(people.get(Charcsub).getName())) {
             			subChar=true;
             			System.out.println("Please enter the amount to decrease health:");
                        double decreHealth=stdinScanner.nextDouble();
                        System.out.println("You entered "+decreHealth);
                        people.get(Charcsub).decreaseHealth(decreHealth);
             		}
             	}
             	 	if(subChar==false) {
             	 		System.out.println("Sorry, could not find "+Name+" in the list");
         
             	}
        }
         
    
         else if(prompt.equals("9")){
             System.out.println("You entered:"+prompt);
            success=false;
             System.out.println("Good-bye!");
        }
    
        else{ 
			System.out.println("could not a valid option"); 
			}
		 
	 
        }
        
        }
    }
 
 
