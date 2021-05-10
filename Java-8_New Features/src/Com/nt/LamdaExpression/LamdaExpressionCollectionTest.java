package Com.nt.LamdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class MyComparater implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		if(o1<o2)
		{
			return -1;	
		}
		
		else if(o1>o2)
		{
			return +1;	
		}
		
		else {
			return 0;
		}
	}
	
}

 class LamdaExpressionCollectionTest {
public static void main(String[] args) {
	ArrayList<Integer> al=new ArrayList<Integer>();
	al.add(10);
	al.add(20);
	al.add(11);
	al.add(5);
	al.add(9);
	System.err.println(al);
	//MyComparater mc=new MyComparater();
	//System.err.println(al.sorted(mc));
	Collections.sort(al,new MyComparater());
	System.err.println(al);
}
}
