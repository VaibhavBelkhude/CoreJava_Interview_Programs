package com.nt.ExceptionHandling;

public class Test {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		try {
			int a=30;
			if(a==40) {
				throw new Test1();
				
			}else {
				//throw new Test2();	
			}
			
		}//try
		catch(Exception e) {
			e.printStackTrace();
		}
	 }

}
/***
Exception in thread "main" java.lang.Error:Unresolved compilation problem: 
Unhandled exception type Test2

at com.nt.ExceptionHandling.Test.main(Test.java:14)
*/