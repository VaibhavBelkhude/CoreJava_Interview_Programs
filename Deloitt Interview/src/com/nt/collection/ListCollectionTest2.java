package com.nt.collection;

import java.util.LinkedList;
import java.util.List;

public class ListCollectionTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String>list=new LinkedList<>();
list.add("A");
list.add("B");
list.add("A");
list.add("C");
list.add("D");
List<String>list2=new LinkedList<>();
list2.add("A");
list.remove(list2);
for(String temp:list) {
	System.out.println(temp+"");
	System.out.println();
	//Output:
	//[A B A C D]
}
	}

}
