package com.nt.Abstraction;
//we can take abstract class or Interface
public abstract class Car {

	abstract void start();
	
	//non abstract method
	public void stop() {
		System.out.println("The Car engine is Stop...");
	}
	
}
