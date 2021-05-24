package com.nt.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class ListCollection_Test1 {

	public static void main(String[] args) {
		// for ArrayList
		List<Integer>list=new ArrayList<Integer>();
		list.add(100);
		list.add(100);
		System.out.println("ArrayList::"+list);
		//for LinkedList
		List<String>list1=new LinkedList<String>();
		list1.add("Vaibhav");
		list1.add("Raja");
        System.out.println("LinkedList::"+list1);
        
      //for LinkedList
      		List<Integer>list2=new Stack<Integer>();
      		list2.add(12356);
      		list2.add(12563);
            System.out.println("Stack::"+list2);
	}

}
