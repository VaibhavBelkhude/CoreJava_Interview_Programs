import java.util.Scanner;

public class PalindromeNumber_Test {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.err.println("Enter the Numer");
		int Number=scn.nextInt();
		
		int reminder,sum=0,temp;
        // int q=454;
         temp=Number;
         
         while(Number>0) {
        reminder=Number%10;//getting remider//4/5/4
        sum=(sum*10)+reminder;//=4/5/4
        Number=Number/10; //454/10=4//54/10=5//40/10=4
         }//while
         
		if(temp==sum) {
			System.err.println("It palindrome Number....");
		}
		else {
			System.err.println("It not palindrome Number");
		}
	}



}
