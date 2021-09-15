package practice;

import java.util.Hashtable;
import java.util.Scanner;

public class Data {
	

public static void main(String[] args) {
	


Scanner sc=new Scanner (System.in);

Hashtable<String, String> hm = new Hashtable<String, String>(); 
System.out.println ("\n enter the product.id nd name:");

for (int i=0;i<3;i++)

hm.put (sc.next(), sc.next());

System.out.println("\n the product list is:");

System.out.println (hm);

System.out.println("\n enter the product id to be removed");

String id=sc.next();

hm. remove(id);

System.out.println("\n item removed");

System.out.println("\n the product list In:");
System.out.println (hm.toString());

System.out.println("\n enter the product Id to be searched: ");

String sid=sc.next();

if (hm.containsKey (sid))

System.out.println (hm.get(sid));
else
System.out.println("\n do not exist.");
sc.close();
}
}