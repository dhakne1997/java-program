package practice;

import java.util.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Students implements Comparable<Students> {
String name;
int rn,age;
double per;


@Override
public String toString() {
	return "Student [name=" + name + ", rn=" + rn + ", age=" + age + ", fees=" + per + ", per=" + per + "]";
}
public Students(String name, int rn, int age, double fees, double per) {
	super();
	this.name = name;
	this.rn = rn;
	this.age = age;
	this.per = fees;
	this.per = per;
}
public int getRn() {
	return rn;
}
public int getAge() {
	return age;
}
public double getFees() {
	return per;
}
public double getPer() {
	return per;
}
@Override
public int compareTo(Students o) {
	
	return this.age-o.age;
}



}


class SortByRoll implements Comparator<Students>
{

	@Override
	public int compare(Students o1, Students o2) {
		// TODO Auto-generated method stub
		return o1.rn-o2.rn;
	}
	
}

class SortByFees implements Comparator<Students>
{

	@Override
	public int compare(Students o1, Students o2) {
		if(o1.getPer()>o2.getPer())
		return 1;
		else if(o1.getPer()<o2.getPer())
			return -1;
		else return 0;
	}
	
}

class SortByPer implements Comparator<Students>
{

	@Override
	public int compare(Students o1, Students o2) {
		if(o1.per>o2.per)
		return 1;
		else if(o1.per<o2.per)
			return -1;
		else return 0;
	}
	
}



 class StuSorts {

	public static void main(String[] args) {
		ArrayList<Students> al = new ArrayList<>();
		Students s1 = new Students("balaji", 111, 18, 100.50, 87.5);
		al.add(s1);
		al.add(new Students("TT", 212, 16, 200.0, 90.8));
		
		al.add(new Students("KG", 54, 17, 200.0, 93.8));
		
		//Collections.sort(al);
		//Collections.sort(al,new SortByRoll());
		//Collections.sort(al,new SortByFees());
		Collections.sort(al,new SortByPer());
		for(Students s:al)
		System.out.println(s);
	}

}

