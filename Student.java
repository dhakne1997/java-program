//Java Program to demonstrate the use of Java Comparable.  
//Creating a class which implements Comparable Interface  



package practice;


import java.util.*; 



class Student implements Comparable<Student>{  
	
	int rollno;  
	String name;  
	int age;  
	
	
	
	
	Student(int rollno,String name,int age){
		
	this.rollno=rollno;  
	this.name=name;  
	this.age=age;  
	}  
	
	
	/*
	
	pu blic int getRollno() {
		return rollno;
	}




	public String getName() {
		return name;
	}




	public int getAge() {
		return age;
	}

*/

      
	public int compareTo(Student st){  
		
		//return this.rollno - st.rollno;

	if(this.age==st.age)  
	return 0; 
	
	else if(this.age>st.age)  
	return 1;  
	else  
	return -1;  
	}  
	}  



	 class TestSort3{  
		 
		 
		 
	public static void main(String args[]){  
	ArrayList<Student> al=new ArrayList<Student>();  
	al.add(new Student(101,"Balaji",23));  
	al.add(new Student(106,"Rahul",2));  
	al.add(new Student(105,"Akshy",21));  
	  
	Collections.sort(al);  
	for(Student st:al){  
	System.out.println(st.rollno+" "+st.name+" "+st.age);  
	}  
	}  
	}  