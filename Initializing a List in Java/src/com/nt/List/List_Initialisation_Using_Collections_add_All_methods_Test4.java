package com.nt.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List_Initialisation_Using_Collections_add_All_methods_Test4 {

	public static void main(String[] args) {
		// Create an empty list
		List<Integer>list=new ArrayList<Integer>();
		
	 // Instantiating list using Collections.addAll()
		Collections.addAll(list,1, 2,3,4,5);
    // Print the list
		System.out.println("list using Collections.addAll()::"+list);
		

	}

}
