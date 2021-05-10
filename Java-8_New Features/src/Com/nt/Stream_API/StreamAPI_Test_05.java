package Com.nt.Stream_API;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
/**
 * Count() Method 
 * to Count Failed Student From Collection
 * @author Vaibhav
 *
 */
public class StreamAPI_Test_05 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("Sunney leoney");
		al.add("Anushka Shetty");
		al.add("Ashwarya Rai");
		al.add("Jacklin Farnadis");
		al.add("Nanapatekar");
		al.add("Puja Hegade");
		al.add("Kajal Agrawal");
		/*
		al.add("A");
		al.add("AAAA");
		al.add("AAA");
		al.add("AAAAA");
		al.add("AA");
		al.add("XXX");
		al.add("AAAAAA");
		*/
		/**
		 *  method we Used 
		 *  1)Stream()
		 *  2)Filter()
		 *  3)Map()
		 *  4)collect()
		 *  5)Count()
		 *  6)sorted()
		 *  Sorting String From Collection
		 */
	/*
	  int l1=s1.Length();
		int l2=s2.Length();
		if(s1<s2) 
			return -1;
		else if(s1<s2) 
			return +1;
		else 
			return 0;
	 */
System.out.println("==========================================");
		System.err.println(al);
		Comparator<String> C=(s1,s2)->{
			int l1=s1.length();
			int l2=s2.length();
			if(l1<l2) 
				return -1;
			
			else if(l1>l2) 
				return +1;
			
			else return s1.compareTo(s2);
		};
		List<String>list=al.stream()
				.sorted(C)
				.collect(Collectors.toList());
		
		System.err.println("Length Wise:"+list);
System.out.println("==========================================");
//======================================================
		List<String>list2=al.stream()
				.sorted((s1,s2)->s1.compareTo(s2))
				.collect(Collectors.toList());
		
		System.err.println(list2);

		
			}
	

}
