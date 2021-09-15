
/*Write a program for a matchstick game being played between the computer and a user. Your program should ensure that the computer always wins. Rules for the game are as follows:
- There are 21 matchsticks.
- The computer asks the player to pick 1, 2, 3, or 4 matchsticks.
- After the person picks, the computer does its picking.
- Whoever is forced to pick up the last matchstick loses the game.*/



package practice;

import java.util.Scanner;

public class MatchStick {


public static void main(String[] args) {
	
Scanner sc=new Scanner(System.in);
    int m = 21, p, c;  
  
    while(m>=1)  
    {  
    	System.out.println("\nNumber of Match sticks left = \n"+m);  
    	System.out.println("Pick 1 or 2 or 3 or 4 matches\n");  
        p=sc.nextInt();  
  
        if(p > 4 || p < 1)  
            continue;  
  
        m = m - p;  
  
        System.out.println("Number of matches left = %d\n"+m);  
  
        c = 5 - p;  
  
        System.out.println("out of which computer picked up %d\n"+c);  
  
        m = m - c;  
  
        if(m == 1)  
        {  
        	System.out.println("\nNumber of matches left = %d\n"+m);  
        	System.out.println("You lost the Game\n");  
        sc.close();
        	break;  
        }  
        
    }  
  
} 
}  

