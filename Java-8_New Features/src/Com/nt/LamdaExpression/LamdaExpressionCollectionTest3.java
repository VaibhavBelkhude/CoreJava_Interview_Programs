package Com.nt.LamdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee{
	String ename;
	Integer eno;
	Employee(String ename,Integer eno){
		this.ename=ename;
		this.eno=eno;
	}
	public String toString() {
		return eno+":"+ename;
		
	}
}
 class LamdaExpressionCollectionTest3 {
public static void main(String[] args) {
	ArrayList<Employee> al=new ArrayList<Employee>();
	al.add(new Employee("Vaibhav",85965));
	al.add(new Employee("Raja",12965));
	al.add(new Employee("Kartik",23965));
	al.add(new Employee("Vikas",35965));
	System.out.println(al);
	Collections.sort(al,(e1,e2)->(e1.eno<e2.eno)?-1:(e1.eno>e2.eno)?+1:0);
	System.err.println(al);
	///java.lang.Object
}
}
