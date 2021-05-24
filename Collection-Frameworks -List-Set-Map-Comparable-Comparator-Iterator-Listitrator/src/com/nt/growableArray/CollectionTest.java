package com.nt.growableArray;

public class CollectionTest {

	public static void main(String[] args) {
		NITCollection col=new NITCollection();
		System.out.println(col);
            col.add('V'); 
		    col.add('a');
		    col.add("raja");
             col.add(true);
             col.add(56);
             col.add(5.6);
             col.add("a");
             col.add("a");
             col.add("VBT");
             col.add('v');
             System.out.println(col);
              System.out.println("A new(5,6):"+col.contain(new A(5,6)));
              System.out.println(col.contain(null));
              System.out.println(col.contain(new A(5,6)));
              System.out.println(col.contain(true));
              System.out.println(col.contain(null));
              System.out.println(col);
             System.out.println(col);
             
	}

}
