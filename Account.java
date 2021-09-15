package lab3;

public class Account

{
	

	int accNum;              
    String name;             
    double balance;
	public double charge;
    
  
  public Account(int a, String n, double amount, int i)

  {

	  accNum = a;
	   	 name = n;
	   	 balance = amount;
	   	 
  }

 
public String ToString(  )
  {
	 return( "Account number: "  + this.accNum
	      + ", Name: "  + this.name
	      + ", Balance: " + this.balance );
  }
  
  
  
  public void deposit( double amount )     
  {
	 this.balance += amount;
  }
  
  
 

  public void withdraw(double amount)

  {

    if (balance >= amount)

       balance -= amount;

    else

       System.out.println("Insufficient funds");

  }

 


  
  public double getBalance()

  {

    return balance;

  }



  public String toString()

  {
	return name;

 

  }

 

 
  public void chargeFee(int charge)

  {

	  double amount = 0;
	if (balance >= amount)
		 
		  System.out.println("10000 rs charge");
	 this.balance +=charge;
	

	 // else
		//  System.out.println("no charge");

  }

 

 

}



 class AccountTest {
    public static void main(String[] args)
    {
 	
	 

	      

	      Account Account = new Account(0, null, 0, 0);

	
	      Account.accNum = 12345;
	      Account.name = "BALAJI";
	      Account.balance = 500000.0;
     
	      Account.charge = 500000.0;

	      
	      String x;
	      
	    	 x = Account.ToString( );
	    	 System.out.println("Account: " + x); 
	     
	    	 Account.deposit( 45000 );
	     
	    	 x = Account.ToString( );
	    	 System.out.println("\n After depositing 45000:\n " + x);
	     
	    	 Account.withdraw( 100000 );
	     
	    	 x = Account.ToString( );
	    	 System.out.println("\n After withdraw 100000: \n" + x);
	    	 
	    	 
	    	 Account.chargeFee( 10000 );
	    	 
	    	 x = Account.ToString( );
	    	 System.out.println("chargeFee: " + x); 
	    	 
	       }
	    }
