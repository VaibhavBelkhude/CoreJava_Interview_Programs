package com.nt.Set_Initialized;
//Create a set and using .add() method we add the elements into the set
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_Initialized {
	public static void main(String[] args) {
		
		Set<Integer>hs=new HashSet<Integer>();
		hs.add(1002);
		// Java code for initializing a Set
		 System.out.println("Elements = "+hs);
		 Iterator<Integer> i=hs.iterator();
		    while (i.hasNext())
		      System.out.println(i.next());
	}

}
