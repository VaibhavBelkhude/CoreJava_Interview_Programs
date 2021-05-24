import java.util.Scanner;
/*A palindrome number is a number that is same after
   reverse.
   */
public class Palindron_number {
 /*
		 public static void main(String args[]){  
		  int r,sum=0,temp;
		//1.  Get the number to check for palindrome
		  int n=454;//It is the number variable to be checked for palindrome  
		//2. Hold the number in temporary variable
		  temp=n; 
		//  Reverse the number
		  while(n>0){    
		   r=n%10;  //getting remainder
		   System.out.println("r:"+r);
		   
		   sum=(sum*10)+r; 
		   System.out.println("sum:"+sum);
		   n=n/10;  
		   System.out.println("n:"+n);
		  } 
//Compare the temporary number with reversed number
		  if(temp==sum)    
		   System.out.println(":palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		}  
		
}
 */        
     
      
     

   public static void main(String args[])  
   {  
      String original, reverse = ""; // Objects of String class  
      Scanner in = new Scanner(System.in);   
      System.out.println("Enter a string/number to check if it is a palindrome");  
      original = in.nextLine();   
      int length = original.length();   
      for ( int i = length - 1; i >= 0; i-- )  
         reverse = reverse + original.charAt(i);  
      if (original.equals(reverse))  
         System.out.println("Entered string/number is a palindrome.");  
      else  
         System.out.println("Entered string/number isn't a palindrome.");   
   }  //454  34543 343 151 616
}  

