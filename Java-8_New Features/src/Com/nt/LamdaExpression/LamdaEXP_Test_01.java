package Com.nt.LamdaExpression;

import java.util.function.Function;
import java.util.function.Predicate;

public class LamdaEXP_Test_01 {

	public static void main(String[] args) {
		Function<Integer,Integer> f=i->i*i*i;
		Function<Integer,Integer> f2=i->i*i;
	System.out.println("Square Of 4::"+f2.apply(4)+"::squbroot:"+f.apply(4));
	System.out.println("Square Of 5::"+f2.apply(5)+"::squbroot:"+f.apply(5));
	Predicate<Integer>p=i->i%2==0;
	System.err.println("Evan ::"+p.test(4));
	}

}
