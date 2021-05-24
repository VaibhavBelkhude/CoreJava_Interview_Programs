package com.nt.RuntimePolymorphism;

//public class MethodOverloading {

//}
/**
Case 2)When we call method and which Overloded method executed
//Given Arrgument type parameter Method is Excecuted
*/
class  A
{

	void m1(int x){
		System.out.println(" Int-arg");
	}

	void m1(char c){
	System.out.println("Char-Args");	
	}
}
class Test2_MOV_TC2{

	public static void main(String[] args) {
		A a=new A();
		int v=10; 
		int w='a';
char ch1='B';
//char ch2="V";
	//1)passing Argument by using:- literal by directly
		a.m1(100); 
		a.m1('V');
		//5)by Casting operator
		a.m1((char)100);
		a.m1((int)'A');
	  //2)by Variable
		a.m1(v);       

//3)by expression
     a.m1(v+w);
	 // a.m1(ch1+ch2);
	System.out.println();
  //4) by non void method
	//	a.m1((int)true);     //CE:- incompatible types: boolean cannot be converted to int
	System.out.println("----------1-----------");
                   a.m1(10+'a');
                  a.m1('m'+'n');
  System.out.println("--------------2-------");
  a.m1((char)('m'+'n'));
  a.m1((char) 'm'+'n');
	}
}
