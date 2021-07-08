package com.nt.collection;

import java.util.ArrayList;
import java.util.Iterator;



public class ListCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String>al1=new ArrayList<String>();
al1.add("A");
al1.add("B");
al1.add("C");

ArrayList<String>al2=new ArrayList<String>();
al2.add("C");
al2.add("D");
al1.removeAll(al2);
System.out.println("List:");
Iterator itr=al1.iterator();
while(itr.hasNext()) {
System.out.println(itr.next());	
       }//while
	}
//Output:
	/**
	 * List:
     *   A
     *   B
	 */
}
