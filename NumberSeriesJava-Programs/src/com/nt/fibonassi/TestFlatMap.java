package com.nt.fibonassi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestFlatMap {
	   public static void main(String[] args)
	    {   
	        // Creating a list of Prime Numbers
	        List<Integer> CustomerPhone1 = Arrays.asList(750751434, 452546667, 781245611,66687913);
	          
	        // Creating a list of Odd Numbers
	        List<Integer> CustomerPhone2 = Arrays.asList(17895422, 78125485, 478563235);
	          
	        // Creating a list of Even Numbers
	        List<Integer> CustomerPhone3 = Arrays.asList(24666622, 333333334, 6988816, 25666668);
	  
	        List<List<Integer>> listOfListofInts =
	                Arrays.asList(CustomerPhone1, CustomerPhone2, CustomerPhone3);
	  
	        System.out.println("The Structure before flattening is : " +
	                                                  listOfListofInts);
	          
	        // Using flatMap for transformating and flattening.
	        List<Integer> listofInts  = listOfListofInts.stream()
	                                    .flatMap(list -> list.stream())
	                                    .collect(Collectors.toList());
	  
	        System.out.println("The Structure after flattening is : " +
	                                                         listofInts);
	    }
	}