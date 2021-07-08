package com.nt.array;

public class Sample {
private int Value=5;

public int getValue() {
	return this.Value;
}

public int getValue(int value) {
	return ( value+2);
}
public int getValue(int...value) {
	return (Value+3);
}
public static void main(String[] args) {
	Sample temp=new Sample();
	System.out.println(temp.getValue(8,9,13));
}
/**
 * Option:[a)8  b)13 c)9  d)16]
 * ans:[8]
 */
}
