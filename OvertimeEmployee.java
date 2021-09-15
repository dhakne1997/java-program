package practice;

import java.util.Scanner;

public class OvertimeEmployee {
	
	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
	
    int count =1, working_hours, over_time;
    float over_time_pay;

    while(count<=10)
    {
        System.out.println("Enter the working hours of employee no %d: "+count);
      working_hours=sc.nextInt();
        if(working_hours>40)
        {
            over_time = working_hours - 40;
            over_time_pay = (float) (over_time * 12.00);
            System.out.println("Employee No overtime pay is ="+count+over_time_pay);
        }
        else
            System.out.println("You have to work for more than 40 hours to get over time pay\n");

        
        count++;
        sc.close();
    }
}
}
