package com.nt.RuntimePoly;

class Bike {
     void start(){
	System.err.println("Bike class Start");
}
}

class Splender extends Bike{
	   void start(){
		System.err.println("Splender RUn at Speed 60km....");
	}
	   public static void main(String[] args) {
		Bike b=new Splender();
		b.start();
	}
}