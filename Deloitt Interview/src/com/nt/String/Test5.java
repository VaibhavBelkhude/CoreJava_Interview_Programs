package com.nt.String;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="JavaJ2eeStrutsHibernate";
String s2="StrutsHibernateJavaJ2ee";
if(s1.length() !=s2.length()) {
	System.out.println("Unequel Length");
}//if
else {
	String s3=s1+s2;
	if(s3.contains(s2)) {
		System.out.println("Verified");
	          }//if
	else {
		System.out.println("Not Verified");
	}//inner else
          }//else
	}
	//no of these
//output:Verified
}
