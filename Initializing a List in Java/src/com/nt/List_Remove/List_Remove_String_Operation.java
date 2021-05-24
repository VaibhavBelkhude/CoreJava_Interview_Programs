package com.nt.List_Remove;

import java.util.ArrayList;
import java.util.List;

//Program to illustrate the
//remove(int index) method
public class List_Remove_String_Operation {

	public static void main(String[] args) {
		// Declare an empty List of size 5
		List<String>list=new ArrayList<String>();
		 // Add elements to the list
		list.add("WELCOME");
		list.add("TO");
		list.add("HALO");
		list.add("TECHNO");
		list.add("SERVE");
		list.add("Dear");
		list.add("Vaibhav");
		list.indexOf(list);
		System.err.println("==============="+list);
		 // Index from which you want to remove element
		int index=3;
		
		 // Initial list
		System.out.println("List Initial::"+list);
		//remove all element in list collection using list.removeAll(list),list.clear()
		//list.clear();
		//list.removeAll(list);
		//System.out.println("List Initial::"+list);
		 // remove element
		list.remove(index);
		// Final list
		System.out.println("List Initial::"+list);
	}

}
