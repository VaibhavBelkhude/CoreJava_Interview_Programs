package com.nt.CustomeThread;

public class ThePriorityTest_25 extends Thread{
public void run() {
	for(int i=0;i<=10;i++) {
		System.out.println(getName()+"<--::Start run()"+i);
		System.err.println("main Method t1 state after object Creation::-"+this.isAlive());
		try{Thread.sleep(2000);
			}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.err.println(getName()+"----Run end----");
		}
}
public static void main(String[] args) {
	ThePriorityTest_25 th1=new ThePriorityTest_25();
	ThePriorityTest_25 th2=new ThePriorityTest_25();
	System.out.println("-------------------------------");
	th1.setPriority(7);
	//th2.setPriority(11);
	th1.setContextClassLoader(null);
	th1.setDaemon(true);
	th1.setName("Vaibhav");
	System.out.println("-------------------------------");
	th2.setPriority(9);
	/*Priority value is in range  should between 1 to 10
	 * else lead  to exception::-->java.lang.IllegalArgumentException
	 * th2.setPriority(-9);
	 * Exception in thread "main" java.lang.IllegalArgumentException
	at java.lang.Thread.setPriority(Unknown Source)
	at com.nt.CustomeThread.ThePriorityTest_25.main(ThePriorityTest_25.java:26)
-------------------------------
-------------------------------
*/
	th1.setContextClassLoader(null);
	th1.setDaemon(true);
	th1.setName("Kartik");
	th1.start();
	th2.start();
}
}
