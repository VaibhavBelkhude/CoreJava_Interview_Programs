package com.nt.string;

public class StringTest_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="abc";
String s2="abc";
String s3="VBT";
   "abc".charAt(2);
// "abc".charAt(0)
  "abc".compareTo("abc");
  "abc".indexOf('c');
String s4=new String("abc");
//=========================("==" operator)==============================
           System.out.println("==Operator:s1==s2:"+(s1==s2));
           System.out.println("==Operator:diff:s2==s3:"+(s2==s3));
           System.out.println("==Operator:s3==s4:"+(s3==s4));
           System.out.println("==Operator:new:s2==s4:"+(s2==s4));
          System.out.println();
//**********equals() Method******************
   System.out.println("s4=equals=s3::"+s4.equals(s3));
   System.out.println("s4=equals=s2::"+s4.equals(s2));
   System.out.println("s2==s4::"+(s2==s4));
   System.out.println("s1=equals=s4::"+s1.equals(s4));
   System.out.println();
//***************Hashcode() method***********************************
   System.out.println("Hashcode::s1=s2::"+(s1.hashCode() == s2.hashCode()));
   System.out.println("Hashcode::s1=s4::"+(s1.hashCode() == s4.hashCode()));
	
	}

}
