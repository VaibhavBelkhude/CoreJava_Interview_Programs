package com.nt.string;

public class ConvertIntegerToString_Test4 {

	public static void main(String[] args) {
//Convert Integer To String Using String.valueOf() method :
		String s1="2145";
		
		String s=String.valueOf(s1);
        System.out.println("String-To-Integer:"+s);
        
 /** To Convert Integer To String Using Integer.toString()
  *  Method :
  */
        int i=1245;
        String s2=Integer.toString(i);
        System.out.println("Integer-To-String:"+s2);
	}

}
