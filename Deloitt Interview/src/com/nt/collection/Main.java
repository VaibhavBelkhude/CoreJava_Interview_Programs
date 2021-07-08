package com.nt.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List object=Arrays.
asList("sun","mon","tue","wed","thu","fri","sat");
System.out.println("List:"+object);
Collections.rotate(object, 3);
System.out.println("rotate:"+object);
/**
 * Output:
 List:[sun, mon, tue, wed, thu, fri, sat]
rotate:[thu, fri, sat, sun, mon, tue, wed]

 */
	}

}
