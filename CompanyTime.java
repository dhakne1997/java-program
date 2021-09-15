package practice;

import java.util.Scanner;

public class CompanyTime {
	public static void main(String[] args) {
		
	
    Scanner sc=new Scanner(System.in);
    float hours;

   System.out.println("Input the time taken by worker: ");
    
   hours=sc.nextInt();
   

    if(hours>=2 && hours<=3)
    	  System.out.println("Worker is highly efficient");
    if(hours>3 && hours <=4)
    	  System.out.println("Worker needs to improve speed");
    if(hours>4 && hours <=5)
    	  System.out.println("Give training to worker");
    if(hours>5)
    	  System.out.println("Worker is terminated");

  
}
}