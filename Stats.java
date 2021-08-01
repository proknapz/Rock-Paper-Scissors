/**
 * <p> This class will determine the outcome of each round based on the decisions made </p>
 * @author Omar Khan 
 *
 */ 

public class Stats
{

   private int choice;
   private int computerChoice;
   String results = "";
   int win = 0;
   int lose = 0;
   int draw = 0;
      


/** 
 *
 * <p> this is the Stats Contructor that prepares two objects , choice and computerChoice, for use </p>
 *
 * @param c  the c
 * @param cc  the cc
 */
   public Stats(int c, int cc) 
   {


   choice = c;
   computerChoice = cc; 
   
   } 
 


/** 
 *
 * Outcome
 * <p> this void method will take the outcome from both the user and the computer and determine the result </p>  
 */
   public void outcome() 
   {

   
         if(choice == 1){
         results += "You chose Rock";
         if (computerChoice == 1){
         
         results += "\nComputer chose Rock";
         draw++;
        
         } else if(computerChoice == 2){
         
         results += "\nComputer chose Paper";
         results += "\nPaper covers Rock";
         lose++;
         
         } else {
         
         results += "\nComputer chose Scissors";
         results += "\nRock crushes Scissors";
         win++;
         
         }
       } else if (choice == 2){
       results += "You chose Paper";
         if (computerChoice == 1){
         
         results += "\nComputer chose Rock";
         results += "\nPaper covers Rock";
         win++;
         
         } else if(computerChoice == 2){
         
         results += "\nComputer chose Paper";
         draw++;
         
         } else {
         
         results += "\nComputer chose Scissors";
         results += "\nScissors cut Paper";
         lose++;
         
         }
       } else {
       results += "You chose Scissors";
         if (computerChoice == 1){
         
         results += "\nComputer chose Rock";
         results += "\nRock crushes Scissors";
         lose++;
         
         } else if(computerChoice == 2){
         
         results += "\nComputer chose Paper";
         results += "\nScissors cut Paper";
         win++;
         
         } else {
         
         results += "\nComputer chose Scissors";
         draw++;
         
         }
       }
       
     } 
       


/** 
 *
 * Print
 *
 */
       public void print() 
       {

       System.out.println(results);
       }



/** 
 *<p> Based on which variable incrminaled will display its corresponding message </p>
 * To string
 *
 * @return String
 */
       public String toString() 
       { 

       if (win == 1)
       {return "You win";}
       else if(lose == 1)
       {return "You lose";}
       else
       {return "Tie";}

    }       
       
   
   }


