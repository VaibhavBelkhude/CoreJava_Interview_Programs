package Com.nt.Stream_API;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI_Test_06 {

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
		 *  5)count()
		 *  6)sorted()
		 *  7)sorted(comparator)
		 *  8)min()
		 *  9)max()
		 *  
		 *  finding Evan And odd number in Collction
		 */
		System.err.println(Marks);
		Integer min=Marks.stream().min((i1,i2)->i1.compareTo(i2)).get(); 
		System.err.println(min);
		Integer max=Marks.stream().max((i1,i2)->i1.compareTo(i2)).get(); 
		System.err.println(max);	
	}

}
