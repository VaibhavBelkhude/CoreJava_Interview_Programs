package com.nt.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class ListCollection_DoubleBraceInitialisation_Test1 {

	public static void main(String[] args) {
		// for ArrayList
		@SuppressWarnings("serial")
		List<Integer>list=new ArrayList<Integer>(){{
		add(100);
		add(100);
		}};
		System.out.println("ArrayList::"+list);
		//for LinkedList
		List<String>list1=new LinkedList<String>() {{
		add("Vaibhav");
		add("Raja");
		}};
        System.out.println("LinkedList::"+list1);
        
      //for LinkedList
      		List<Integer>list2=new Stack<Integer>() {{
      		add(12356);
      		add(12563);
      		add(120063);
      		add(1200563);
      		add(1256003);
      		}};
            System.out.println("Stack::"+list2);
	}

}
