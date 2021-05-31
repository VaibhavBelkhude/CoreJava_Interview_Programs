package com.nt.string;

public class ImmutableString {
	
	    public static void main(String[] args){
	    	
//case:1
	    	/**
	    	 * Once we tried to change the content of the object using ‘s1’,
	    	 * a new object is created in the pool with “JAVAJ2EE” as it’s content and 
	    	 * it’s reference is assigned to s1. If the strings are mutable,
	    	 *  both s1 and s2 should point to same object even after modification.
	    	 *   That never happened here.
	    	 */
	    	 String s1 = "JAVA";
	    	 
	         String s2 = "JAVA";
	  
	         System.out.println(s1 == s2);         //Output : true
	  
	         s1 = s1 + "J2EE";
	         
	          System.out.println(s1);
	          
	         System.out.println(s1 == s2);         //Output : false
//****************************************************************************
//case:2	     
	    /**
	   *  I tried to concatenate “SPRING” to an existing string “JAVA”,
	   *   a new string object is created with “JAVASPRING” as it’s content. 
	   *  But we don’t have reference to that object in this program.
	   */
	         
	        String s3 = new String("JAVA");
	 
	        System.out.println(s3);         //Output : JAVA
	 
	        s3.concat("SPRING");
	        
	        System.out.println(s3);         //Output : JAVA
//*******************************************************************************	  
	        StringBuffer sb1 = new StringBuffer("HELLO");
	        sb1.append("Boolo");
	        System.out.println("Sb1:"+sb1);
	}
}
