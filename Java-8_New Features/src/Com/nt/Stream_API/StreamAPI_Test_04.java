package Com.nt.Stream_API;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
/**
 * Sorted() Method 
 * ASC and DSC Order
 * to sorted Failed Student From Collection
 * @author Vaibhav
 *
 */
public class StreamAPI_Test_04 {

	public static void main(String[] args) {
		ArrayList<Integer> Marks=new ArrayList<Integer>();
		Marks.add(75);
		Marks.add(56);
		Marks.add(30);
		Marks.add(78);
		Marks.add(31);
		Marks.add(85);
		Marks.add(25);
		Marks.add(95);
		/**
		 *  method we Used 
		 *  1)Stream()
		 *  2)Filter()
		 *  3)Map()
		 *  4)collect()
		 *  5)Count()
		 *  6)Sorted()
		 *  sorted Student From Collection ASC order
		 */
		
		System.err.println(Marks);
      /* List<Integer>sortedList=Marks.stream().sorted()
                                       .collect(Collectors.toList());
		System.err.println(sortedList);
		System.err.println(Marks);*/
//===================================================================
		/*
	       List<Integer>sortedList2=Marks.stream() 
	    		                 .sorted((i1,i2)->i1<i2?1:(i1>i2)?-1:0)
	                             .collect(Collectors.toList());
	     */
//===================ASC Order================================================		
	/*       List<Integer>sortedList2=Marks.stream() 
	                 .sorted((i1,i2)->i1.compareTo(i2))
                   .collect(Collectors.toList());
			System.err.println(sortedList2);*/
//===================DSC Order================================================		
		       List<Integer>sortedList2=Marks.stream() 
		                 .sorted((i1,i2)->-i1.compareTo(i2))
	                   .collect(Collectors.toList());
				System.err.println(sortedList2);			
			
			}

}
