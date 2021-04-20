import java.io.ObjectInputStream.GetField;

import javax.annotation.Generated;

//1)  class can be declared as final becasue class object data can not be modified
public final class Immutable {
//2) declared  variable or members  as Private
private Integer SID;
private String Sname;
private String Phone;
private Float Sfees;

public Immutable(Integer SID,String Sanme,String Phone,Float Sfees) {
	
//3)class  Variable or members  are  initialized using Constructor
	this.SID=SID;
	this.Sname=Sanme;
	this.Phone=Phone;
	this.Sfees=Sfees;
}

//4)getter Method returns the copy of class member
public Integer getSID() {
	return SID;
}
public String getSname() {
	return Sname;
}
public String getPhone() {
	return Phone;
}
public Float getSfees() {
	return Sfees;
}

}
class MainTest{
	public static void main(String[] args) {
		//create object of Immutable object
		Immutable obj=new Immutable(1010,"Vaibhav","+91-7507514349",4525.0f);
		System.err.println("SID::->"+obj.getSID());
		System.err.println("Sname::->"+obj.getSname());
		System.err.println("Phone::->"+obj.getPhone());
		System.out.println("Sfees::->"+obj.getSfees());
		System.err.println("\nData Succusesfully inserted into Immutable Object...");
	}
}