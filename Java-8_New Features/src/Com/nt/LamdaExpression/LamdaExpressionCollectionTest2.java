package Com.nt.LamdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

 class LamdaExpressionCollectionTest2 {
public static void main(String[] args) {
	ArrayList<Integer> al=new ArrayList<Integer>();
	al.add(10);
	al.add(8);
	al.add(6);
	al.add(9);
	al.add(7);
	System.err.println(al);
	Comparator<Integer>c=(o1,o2)->{return (o1<o2)?-1:(o1>02)?+1:0;};
	
	Collections.sort(al,c);
	System.err.println(al);
	//using ForEach() method
	al.stream().forEach(System.out::println);
	
	List<Integer>list=al.stream().filter(i->i%2==0).collect(Collectors.toList());
	//Counting How Many Even Number in Collection
	long list2=al.stream().filter(i->i%2==0).count();
	System.out.println("Evan Number R::->"+list2);
	
	//Counting How Many Odd Number in Collection
	long list3=al.stream().filter(i->i%2==1).count();
	System.out.println("Odd Number R::->"+list3);
	/***
	 * Compares its two arguments for order.  Returns a negative integer,
     * zero, or a positive integer as the first argument is less than, equal
     * to, or greater than the second.<p>
	 */
	// boolean equals(Object obj);

	    /**
	     * Returns a comparator that imposes the reverse ordering of this
	     * comparator.
	     *
	     * @return a comparator that imposes the reverse ordering of this
	     *         comparator.
	     * @since 1.8
	     */

	   /*default Comparator<T> reversed() {
	        return Collections.reverseOrder(this);
	        
	    }
              */
	    /**
	     * Returns a lexicographic-order comparator with another comparator.
	     * If this {@code Comparator} considers two elements equal, i.e.
	     * {@code compare(a, b) == 0}, {@code other} is used to determine the order.
	     *
	     * <p>The returned comparator is serializable if the specified comparator
	     * is also serializable.
	     */
	
}
}
