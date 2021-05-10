package in.NVRST.ComparableTestCase;
/**
 * @Author:Vaibhav Belkhude
 * 
 * */
/*
 * Comparable provides a single sorting sequence.In other words,we can sort 
   the collection on the basis of a single element such as id, name, and price.
 * Comparable affects the original class, i.e., the actual class is modified. 
 * Comparable provides "compareTo()"method to sort elements.
 * Comparable is present in java.lang package.
 * We can sort the list elements of Comparable type by "Collections.sort(List)" method
 * */
import java.util.ArrayList;
import java.util.Collections;

public class Hospital implements Comparable<Hospital> {
private String HospitalName;
private String DoctorName;
private String DiseasesName;
private String NursesName;
private Double PatientFees;
	//required Arg Constructor	
	public Hospital(String HospitalName,String DoctorName,
			        String DiseasesName,String NursesName,Double PatientFees) {
		
	this.HospitalName=HospitalName;
	this.DoctorName=DoctorName;
	this.DiseasesName=DiseasesName;
	this.NursesName=NursesName;
	this.PatientFees=PatientFees;
}


	@Override
	public int compareTo(Hospital ht) {
		if(PatientFees==ht.PatientFees)  
			return 0;  
			else if(PatientFees>ht.PatientFees)  
			return 1;  
			else  
			return -1;  
		//return 0;
	}

//Creating a test class to sort the elements  
 
public static void main(String args[]) throws InterruptedException{  
ArrayList<Hospital> al=new ArrayList<Hospital>();  
al.add(new Hospital("LilawatiHospital","Dr.Vijay","Covid-19","Laxmi",42000.0)); 
Thread.sleep(6000);
al.add(new Hospital("KantaaiHospital","Dr.Murtunjay","Covid-19","Aliya",10000.0));
Thread.sleep(3000);
al.add(new Hospital("ABCHospital","Dr.Sanjay","Fever","Karina",58000.0)); 
Thread.sleep(4000);
System.err.println("\n==============================================");
Collections.sort(al); 

for(Hospital ht:al){  
System.out.println("HospitalName::="+ht.HospitalName);
System.out.println("DoctorName::="+ht.DoctorName);
System.out.println("DiseasesName::="+ht.DiseasesName);
System.out.println("NursesName::="+ht.NursesName);
System.out.println("PatientFees::="+ht.PatientFees);  
System.err.println("==============================================");
} 
}  
}  