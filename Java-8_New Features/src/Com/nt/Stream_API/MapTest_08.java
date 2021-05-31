package Com.nt.Stream_API;

import java.util.Arrays;
import java.util.List;

public class MapTest_08 {
	public static void main(String[] args)
    {
  
        System.out.println("The stream after applying "
                           + "the function is : ");
  
        // Creating a list of Integers
        List<Integer> list = Arrays.asList(3, 6, 9, 12, 15);
        List<Integer> list1 = Arrays.asList(3, 6, 9, 12, 15);
  
        // Using Stream map(Function mapper) and
        // displaying the corresponding new stream
        
        List<List<Integer>> Listoflist=Arrays.asList(list,list1);
    System.out.println(Listoflist);
    }
}