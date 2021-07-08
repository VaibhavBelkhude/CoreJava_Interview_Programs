package com.nt.collection;

import java.util.LinkedHashSet;

class coll {
int size;
public coll(int s) {
	size=s;
}
public boolean equals(Object o) {
	return(this.size==((coll)o).size);
}
public int hashCode() {
	return size/5;
}
}
class collTest{
	public static void main(String[] args) {
		LinkedHashSet<coll>set=new LinkedHashSet<coll>();
		set.add(new coll(1));
		set.add(new coll(2));
		set.add(new coll(1));
		System.out.println(set.size());
		//Output: 2
		//option:[1 ][2] [compilation error] [3]
	}
}