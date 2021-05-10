package Com.nt.Stream_API;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI_Test_02 {

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
		 *  finding Evan And odd number in Collction
		 */
		System.err.println(Marks);
		List<Integer> list=Marks.stream().filter(m->m>35).collect(Collectors.toList());
		System.err.println(list);
		List<Integer> list2=Marks.stream().filter(m->m<35).collect(Collectors.toList());
		System.err.println(list2);
		List<Integer> list3=Marks.stream().map(m->m+5).collect(Collectors.toList());
		System.err.println(list3);
	}

}
