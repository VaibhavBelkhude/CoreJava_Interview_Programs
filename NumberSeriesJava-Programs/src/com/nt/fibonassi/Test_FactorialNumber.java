package com.nt.fibonassi;

public class Test_FactorialNumber {
 
	public static void main(String[] args) {
		int i,fact=1;
		int num=6;
		for(i=1;i<=num;i++) {
			fact=fact*i;
			System.out.println(+i+"*"+fact);
			
		}
		System.out.println("Factorial No Of::"+num+"::Is::"+fact);
	}

}
