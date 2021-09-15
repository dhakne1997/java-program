package practice;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateClass {

	
	public static


	int day;
	public int month;
	public int year;

	void accept(int d,int m,int y)
	{
	day=d;
	month=m;
	year=y;
	}


	void print()

	{

	//cout<< day<<"/"<<month<<"/"<<year;

System.out.println(""+day+month+year);
	}



	public static void main(String[] args) 
		

	{



		 LocalDateTime D = LocalDateTime.now(); 
		    System.out.println(D);
	    

	}
}







