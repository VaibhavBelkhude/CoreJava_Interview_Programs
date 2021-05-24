package com.nt.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UsingArraysasList_Method_mutable_List {

	public static void main(String[] args) {
		//create Mutable List
		List<Integer> list=new ArrayList(Arrays.asList(1,2,3,4,10));
        

        // Print the list
		System.out.println("Mutable_list:"+list);
		 // Print the Modify list
		  list.add(5);
		System.out.println("Modify_list:"+list);
		
         
	}

}
