package com.nt.String;

public class Employee {
int Employee_id;
String Employee_name;
String location;
public Employee(int employee_id, String employee_name, String location) {
	super();
	Employee_id = employee_id;
	Employee_name = employee_name;
	this.location = location;
}
public static void main(String[] args) {
	Employee e1=new Employee (101,"Raja","pune");
	Employee e2=new Employee (101,"Gaja","pune");
	System.out.println(e1);
    System.out.println(e2);
    /*  Output:
     * com.nt.String.Employee@15db9742
       com.nt.String.Employee@6d06d69c

     * 
     * */
}
}
