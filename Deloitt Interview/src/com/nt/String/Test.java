package com.nt.String;

public class Test {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity()+"\t");
		System.out.println("=========1==========");
		sb.append("Code");
		System.out.println(sb.capacity()+"\t");
		System.out.println("=========2==========");
		sb.append("Java is my favourite lagunage");
		System.out.println(sb.capacity()+"\t");
		System.out.println("==========3=========");
		
		sb.ensureCapacity(18);
		System.out.println(sb.capacity()+"\t");
		System.out.println("===========4========");
		
		sb.ensureCapacity(50);
		System.out.println(sb.capacity()+"\t");
		System.out.println("===========5========");
		System.out.println();//16 16  34 34 34 70
		
		//System.out.println();
		//System.out.println();

	}

}
