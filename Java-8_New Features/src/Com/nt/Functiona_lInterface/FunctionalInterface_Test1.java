package Com.nt.Functiona_lInterface;
@FunctionalInterface
interface FunctionalInterface_Test1
{
//allow only one abstract method 
public void add(int a, int b);
//public void mul(int a, int b);
//void m2();
//taking Multiple Abstract method in FI it will show CE
/***
@FunctionalInterface
^
  LamdaExp_Test1 is not a functional interface
    multiple non-overriding abstract methods found in interface LamdaExp_Test1
1 error
*/
//allow mulitple inner class
public class Vaibhav{}
public class Viki{}

//allow public static final variable
public static final int a=10;
public static final int b=14;

//allow multiple defualt method
public default void m2(){}
public default void m3(){}

//allow multiple static method
 public static void m4(){}
 public static void m5(){}
//allow multiple private static and Non-static method is java 9 v features
 private static void m6(){}
 private  void m7(){}

//allow multiple abstract method java.lang.Object class method
public abstract int hashCode();
public abstract boolean equals(Object obj);

//public default String toString(){
//	return "VB";
//}
/*
LamdaExp_Test1.java:39: error: default method toString in interface
LamdaExp_Test1 overrides a member of java.lang.Object
public default String toString(){
                      ^
1 error
*/
}
