package Com.nt.Stream_API;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
/**
 * Count() Method 
 * to Count Failed Student From Collection
 * @author Vaibhav
 *
 */
public class StreamAPI_Test_03 {

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
		 *  Count Failed Student From Collection
		 */
		System.err.println(Marks);
		long NoOFStudentFailed=Marks.stream().filter(m->m<35).count();
		System.err.println(NoOFStudentFailed);
			}

}
