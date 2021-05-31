package com.nt.string;

public class Checkwhetheronestringisrotationofanotherstring_Test5 {
	public static void main(String[] args) {
		String s1 = "JavaJ2eeStrutsHibernate";
		 
        String s2 = "StrutsHibernateJavaJ2ee";
	/*
	 String s1 = "Hello_Java_Boss";
	 
     String s2 = "Hello_Hibernate_Boss";
*/
     //Step 1
     if(s1.length() != s2.length())
     {
         System.out.println("s2 is not rotated version of s1");
     }
     else {
    	//Step 2
    	 
         String s3 = s1 + s1;
         if(s3.contains(s2))
         {
             System.out.println("s2 is a rotated version of s1");
         }
         else
         {
             System.out.println("s2 is not rotated version of s1");
         }
     }
 }
}
