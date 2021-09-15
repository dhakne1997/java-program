package practice;

import java.util.Scanner;

public class gregorianCalender {

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);

	int ref_year=1900,year,leap=0,diff,total_days=0,day=0;
	System.out.println("\n Enter the year between 1900 and 2099=");
	year=sc.nextInt();
	
	diff=year-ref_year;
	while(ref_year<year)
	{
		if(ref_year%100==0)
		{
			if(ref_year%400==0)
			{
				leap++;
			}
			
		}
		ref_year++;
	}
	total_days=(diff-leap)*365+leap*366;
	day=total_days%7;
	
	System.out.println("\n the day on 21 august was="+year);
	System.out.println("\n the day on 21 august was="+year);

	sc.close();

	
	switch(day)
	{
		case 0:System.out.println("Monday.\n");
		break;
		
		case 1:System.out.println("tuesday.\n");
		break;
		
		case 2:System.out.println("wednesday.\n");
		break;
		
		case 3:System.out.println("thursday.\n");
		break;
		
		case 4:System.out.println("friday.\n");
		break;
		
		case 5:System.out.println("saturdayday.\n");
		break;
		
		case 6:System.out.println("sunday.\n");
		break;
	}
	}
}
