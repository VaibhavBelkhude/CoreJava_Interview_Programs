package com.nt.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class List_Initialize_Using_Collections_unmodifiableList_Array_asList {

	public static void main(String[] args) {
		try {
		//List_Initialize_Using_Collections_unmodifiableList method
		List <Integer>list=Collections.unmodifiableList(
				Arrays.asList(1,2,3,4,8,5)
				);
        //Print the list
		System.out.println("List::"+list);
		 // Trying to modify the list
	System.out.println("Trying to modify the list");
		list.set(10, list.get(0));
		//list.add(45);
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
