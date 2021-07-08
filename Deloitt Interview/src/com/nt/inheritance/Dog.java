package com.nt.inheritance;
class Animal{
	void eat() {
		System.out.println("Inside Animal");
	}
}
public class Dog extends Animal{
	void eat() {
		System.out.println("Inside Dog"+ getClass());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Animal a=new Dog();
a.eat();
	}

}
