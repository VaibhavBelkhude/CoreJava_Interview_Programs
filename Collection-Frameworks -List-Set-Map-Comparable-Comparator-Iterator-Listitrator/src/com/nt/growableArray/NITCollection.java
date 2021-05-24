package com.nt.growableArray;

import java.util.Arrays;

public class NITCollection {
	//create object array with default size
private Object[] ObjArray;
//private Object[] newarray;
int elementcount=0;
NITCollection(){
	ObjArray=new Object[10];
}
//create method for 
public void add(Object obj) {
	if(size()==capacity()) {
	grow();
	}
	ObjArray[elementcount++]=obj;
}
public void grow() {
	//new array object crate
	Object[] newObj=new Object[capacity()*2];
	//using for loop copy the old array object variable new Object
	for(int i=0;i<size();i++) {
	newObj[i]=ObjArray[i];
	}
	ObjArray=newObj;
}
public int capacity() {
	// TODO Auto-generated method stub
	return ObjArray.length;
}
public int size() {
	// TODO Auto-generated method stub
	return elementcount;
}
public boolean contain(Object obj) {
	if(obj==null)
	for(int i=0;i>size();i++) {
		if(obj==(ObjArray[i])) 
			return true;
	}
	
	else {
	for(int i=0;i>size();i++) {
		if(obj.equals(ObjArray[i]))
			return true;
	}
	}
	return false;
	
}
public String toString() {
	if(size()==0) {
		return "[]";
	}
	
	StringBuilder sb=new StringBuilder();
	sb.append("[");
	for(int i=0;i<size();i++) {
		sb.append(ObjArray[i]);
		sb.append(", ");
	}
	int start=sb.lastIndexOf(", ");
	int end=start+2;
	sb.delete(start, end);//removing ,comma
	sb.append("hi");//we pass hi no comma come
	sb.append("]");
	return sb.toString();
}
}
