package Com.nt.Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapTest_07 {
	public static void main(String[] args)
    {
  
        // Creating a List of Strings
        List<String> list = Arrays.asList("Vaibhav", "BELKHUDE",
                                 "Interview", "First");
        list.stream().map(str -> 
        Stream.of(str.charAt(0))).
        forEach(System.out::println);
        // Using Stream flatMap(Function mapper)
        list.stream().flatMap(str -> 
                         Stream.of(str.charAt(0))).
                         forEach(System.out::println);
    }

}
