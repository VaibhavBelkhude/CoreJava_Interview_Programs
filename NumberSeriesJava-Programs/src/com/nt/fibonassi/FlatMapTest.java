package com.nt.fibonassi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapTest {

	public static void main(String[] args) {
		   // Creating a List of Strings
		List<String>list=Arrays.asList("5.8","6.5","7.5","8.5");
		          list.stream().flatMap(num -> Stream.of(num)).
		          forEach(System.out::println);

        // Using Stream flatMap(Function mapper)
		
	}

}
