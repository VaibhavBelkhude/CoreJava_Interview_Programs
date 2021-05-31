package com.nt.fibonassi;

import java.util.Scanner;

public class Test_Fibonacci {
	//method to prints
	//first n fibonacci Number
	public static void PrintFibonacciNumber(int n) {
	int f1=0,  
		f2=1,
		  i;	
	if(n<1)
		return;
	System.out.print(f1 +" ");
	for(i=1;i<n;i++) {
		System.out.print(f2+" ");
		int temp=f1+f2;
		f1=f2;
		f2=temp;
	}
	}
	//Drive code
	

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter the Fibonacci Number you want to print:");
		int Print=scn.nextInt(); 
		PrintFibonacciNumber(Print);

	}

}
