package in.NVRST.LinkedHashSet;

import java.util.LinkedHashSet;

public class LinkedHashSetAddingTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet lhs=new LinkedHashSet();
		StringBuilder sb1=new StringBuilder("a");
		StringBuilder sb2=new StringBuilder("b");
		StringBuilder sb3=new StringBuilder("c");
		StringBuilder sb4=sb3;

		
		//lhs.add("Vaibhav");
		/*
		lhs.add("a"+"::-"+lhs.hashCode());
		System.err.println(lhs);
		lhs.add("a"+"::-"+lhs.hashCode());
		System.err.println(lhs);
		lhs.add("b" +"::-"+lhs.hashCode());
		System.err.println(lhs);
		lhs.add(98+"::-" +lhs.hashCode());
		System.err.println(lhs);
		lhs.add(new String("a"));
		System.err.println(lhs);
		lhs.add('a'+"::-"+lhs.hashCode());*/
		System.err.println("=============================");
		lhs.add(sb1);
		lhs.add(sb2);
		lhs.add(sb3);
		lhs.add(sb4);
		System.err.println(lhs);
	//	lhs.add(sb5);
		System.err.println("=============================");
		lhs.add("Vaibhav");
		lhs.add("a");
		System.out.println("1a"+lhs.hashCode());
		lhs.add("a");
		//lhs.hashCode();
		System.out.println("2a"+lhs.hashCode());
		lhs.add("b" );
		System.out.println("b"+lhs.hashCode());
		lhs.add(98);
		System.out.println("98:"+lhs.hashCode());
		lhs.add(new String("a"));
		System.out.println("3a:"+lhs.hashCode());
		lhs.add('a');
		System.err.println(lhs);
	}

}
