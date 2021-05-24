package com.nt.Encapsulation;

public class BankAccount {
//1. Declare Variable as Private	
private int uID;
private double uBalance;
//========================================================
//2.by defining one pair of public Setter and Getter method
public void setUBalance(double uBalance) {
	if(uBalance<=0) {
		System.err.println("Don't Enter Negative Number");
	}//if
	else {
		this.uBalance=uBalance;
	}//else
}//set
//===========================================================
public void setANO(int uID) {
if(uID<=0) {
	System.out.println("Please Enter Valid ID");
}//if
else {
this.uID=uID;	
   }//else	
}//set
//=======================================================
	public Double getUBalance(){
		return uBalance;
	}
/*	
	@Override
public String toString() {
	return "BankAccount [uID=" + uID + ", uBalance=" + uBalance + "]";
}*/
	@Override

public String toString() {
		return "BankAccount[uID="+uID+",uBalance="+uBalance+"]";
	}
                       /*
                        public String toString() {
                        return"Employee[name="+name+",
                        		address="+address+",
                        		email="+email+",
                        		phone="+phone+",
                        		salary="+salary+"]";     
                 public String toString() {
                	 return "Customer[cID="+cID+",
                	                  cName="+cName+",
                	                  caddr="+caddr+"]";
                 }
                 */
}
