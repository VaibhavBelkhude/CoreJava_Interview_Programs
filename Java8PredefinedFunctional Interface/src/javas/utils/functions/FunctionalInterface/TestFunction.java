package javas.utils.functions.FunctionalInterface;

import java.util.function.Function;
import java.util.function.Predicate;
/**
 * 
 * @author Vaibhav
 *Function functionalinterface:
  ===============================
Input-->String as Arrgument 
Output-->Integer is Return type
Performing operation with input
 */
public class TestFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function <Student,String>f=s->{
			int marks=s.marks;
			String grade=" ";
			if (marks>=80) grade="A[Distinction]";
			else if(marks>=60) grade="B[First class]";
			else if(marks>=50 )grade="C[second class]";
			else if(marks>=35) grade="D[third class]";
			else grade ="E[Failed]";
			return grade;
			};
			//Predicate <Student>p=s->s.marks>60;
			Student[] s={
			new Student("Durga",89),
			new Student("Raja",60),
			new Student("Ram",65),
			new Student("Sham",50),
			new Student("Gaja",35),
			new Student("Vija",25)
			};
			for(Student s1:s){
			//if(p.test(s1)
			{
			System.out.println("StudentName:"+s1.name);
			System.out.println("StudentMarks:"+s1.marks);
			System.out.println("StudentGrade:"+f.apply(s1)
			
			);
			System.out.println();
			}
			}
	}

}
