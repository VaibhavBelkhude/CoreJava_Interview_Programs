package com.nt.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class List_Intialize_Using_StreamAPI {

	public static void main(String[] args) {
		
// Creating a List using Syntax 1
List<Integer>list1=Stream.of(1,2,3)
				.collect(Collectors.toList());
// Printing the list
System.err.println("List1:"+list1);
//Creating a List using Syntax 2
List<Integer>list2=Stream.of(1,2,3,4)
                        .collect(Collectors.
                        		toCollection(ArrayList::new));

// Printing the list
System.err.println("List2:"+list2);
//Creating a List using Syntax 3
List<Integer> list3 = Stream
.of(1, 2, 3, 4,5)
.collect(
    Collectors
        .collectingAndThen(
            Collectors.toList(),
            Collections::unmodifiableList));
// Printing the list
System.err.println("List3:"+list3);
	}

}
