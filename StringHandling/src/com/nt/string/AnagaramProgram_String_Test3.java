package com.nt.string;
/**
 * Two strings are called anagrams 
 * if they contain same set of characters but in different 
 * order. For example, “Dormitory – Dirty Room”, 
 * “keep – peek”,  “School Master – The Classroom”
 *  are some anagrams.
 */
import java.util.Arrays;

public class AnagaramProgram_String_Test3 {
static void isAnagram(String s1,String s2) {
	 //Removing all white spaces from s1 and s2
	
	String copys1=s1.replaceAll("\\s","");
	String copys2=s2.replaceAll("\\s","");
	
	//Initially setting status as true
	boolean status=true;
	if(copys1.length()!=copys2.length()) {
		status=false;
	}
	else {
		char [] s1Array=copys1.toLowerCase().toCharArray();
		char [] s2Array=copys2.toLowerCase().toCharArray();
	
	 //Sorting both s1Array and s2Array
	      Arrays.sort(s1Array);
	      Arrays.sort(s2Array);
	 //Checking whether s1Array and s2Array are equal
	      status=Arrays.equals(s1Array,s2Array);
	}
	//Output
	if(status) {
		System.out.println(s1+"::and::"+s2+"::are anagrams::");
	}
	else {
		System.out.println(s1+"::and::"+s2+"::are not Anagrams");
	}
	
}
	public static void main(String[] args) {
isAnagram(" ROOt"," TooR");	
isAnagram("School MASTER", "The ClassROOM");
isAnagram("Mother In Law", "Hitler Woman");

isAnagram("keEp", "peeK");

isAnagram("SiLeNt CAT", "LisTen AcT");

isAnagram("Debit Card", "Bad Credit");

isAnagram("School MASTER", "The ClassROOM");

isAnagram("DORMITORY", "Dirty Room");

isAnagram("ASTRONOMERS", "NO MORE STARS");

isAnagram("Toss", "Shot");

isAnagram("joy", "enjoy");

	}

}
