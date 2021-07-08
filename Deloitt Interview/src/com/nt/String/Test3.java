package com.nt.String;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1=new String("hello");
String s2="hello";
String s3=s1.intern();
System.out.println(s1==s2);
System.out.println(s2==s3);
/* Output:
 * false
   true

 * */
	}

}
