package Com.nt.LamdaExpression;
/*class MyRunnable implements Runnable {

public void run(){
	for(int i=0;i<10;i++)
		       {
		
          System.out.println("Child thread");
	     }
	}
}*/
//After lamda Expression we don't need to write Any class and Not need create any object 
public class Lamda_MultithreadingTest {
	public static void main(String[] args) 
	{
		//MyRunnable mr=new MyRunnable();
		//Runnable functional interface directly use
		Runnable r=()->{for(int i=0;i<10;i++) 
		 System.out.println("Child thread");	
		};
		Thread t=new Thread(r);
		t.start();
       for(int i=0;i<10;i++)
		   {
		System.out.println("Main thread");
	   }
	}
}
