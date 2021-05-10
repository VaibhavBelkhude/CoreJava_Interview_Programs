package Com.nt.Stream_API;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI_Test_01 {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(12);
		al.add(16);
		al.add(11);
		al.add(15);
		al.add(50);
		al.add(40);
		System.err.println(al);
		List<Integer> list=al.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.err.println("Even Nunber is:-"+list);
		List<Integer> list1=al.stream().filter(i->i%2==1).collect(Collectors.toList());
        System.err.println("Odd Nunber is:-"+list1);
	}

}
