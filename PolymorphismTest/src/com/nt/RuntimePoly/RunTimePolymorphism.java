package com.nt.RuntimePoly;

public class RunTimePolymorphism {
public static void main(String[] args) {
	RBI rbi;
	rbi=new SBI();
	System.out.println("SBI Rate of Interest: "+rbi.getRateofInterest());
	rbi=new BOI();
	System.out.println("BOI Rate of Interest: "+rbi.getRateofInterest()); 
	rbi=new HDFCBank();
	System.out.println("HDFCBank Rate of Interest: "+rbi.getRateofInterest());
	rbi=new ICICIBank();
	System.out.println("ICICIBank Rate of Interest: "+rbi.getRateofInterest());
}
}
