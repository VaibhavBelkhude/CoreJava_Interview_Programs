package com.nt.string;

public class ReverseString_test2 {
	
	static String recursiveMethod(String str)
	{
	     if ((null == str) || (str.length() <= 1))
	     {
	            return str;
	     }
	 
	     return recursiveMethod(str.substring(1)) + str.charAt(0);
	}
/**
 * using StringBuffer[(sbf.reverse();)]
 * */
	public static void main(String[] args) {
		//sbf.reverse();
		StringBuffer sbf = new StringBuffer("MyJava");
		 
		System.out.println(sbf.reverse());    //Output : avaJyM
		//3. Using Recursive Method
		String str = "MyJava";
        System.out.println(recursiveMethod(str));    //Output : avaJyM
//****************************************************************
	/**
		2)Using iterative method:
		In this method, first we convert given string to char array using 
		charArray() method. And then we iterate that array in the reverse order.
	*/
		
		 
		char[] strArray = str.toCharArray();
		 
		for (int i = strArray.length - 1; i >= 0; i--)
		{
		    System.out.print(strArray[i]);     //Output : avaJyM
		}
		System.out.println();
//====================================================================
		
		String st="VAIBHAV";
		char [] arrchar=st.toCharArray();
		for(int j = arrchar.length -1;j>=0;j--) {
			System.out.print(arrchar[j]);
			}
		System.out.println();
//================================================================
		
	}

}
