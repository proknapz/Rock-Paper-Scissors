/**
* 
* @author <p> Omar Khan </p>
* This is the main method. Here the computer and user make their choice. Depending on the choices a winner will be delared.
* After the user is asked if they want to continue. Depending on the answer the game will resume or end.
*/

import java.util.*;
import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
  public static void main( String[] args ) 
  {  
     String awnser="";
        int max = 3;
        int min = 1;

    do{ 
        Random randomNum = new Random();
        int computerChoice = min + randomNum.nextInt(max);      
        Scanner scan = new Scanner( System.in );
	     System.out.print( "1 - Rock\n2 - Paper\n3 - Scissors\nEnter your pick :: " );
        int choice = scan.nextInt();
        Stats s = new Stats(choice, computerChoice);
        s.outcome();     
        s.print();
        System.out.println(s.toString());

          

        System.out.println("Do you want to continue?");
        awnser=scan.next(); 

      }while(awnser.equals("y") || awnser.equals("Y")); 

    
            
    
    
  }
}