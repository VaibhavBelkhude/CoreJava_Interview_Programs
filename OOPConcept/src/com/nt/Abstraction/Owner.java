package com.nt.Abstraction;

public class Owner extends Car{

	@Override
	
	void start() {
		
   System.out.println(Thread.holdsLock(getClass()));
	System.err.println(":-car engine has start...");			
	}//start
	public static void main(String[] args) {
		Owner obj=new Owner();
		//calling from abstract method
		obj.start();
	
		obj.stop();
	}

}
