package com.nt.CustomeThread;

public class Thread_is_Alive_Or_Not_test24 extends Thread{

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
	public static void main(String[] args) throws InterruptedException {
		System.err.println("main Start");
		Thread_is_Alive_Or_Not_test24 t1=new Thread_is_Alive_Or_Not_test24();
		System.err.println("main Method t1 state after object Creation::-"+t1.isAlive());
		t1.start();
		Thread_is_Alive_Or_Not_test24 t2=new Thread_is_Alive_Or_Not_test24();
		System.err.println("main Method t2 state after object Creation::-"+t2.isAlive());
		t2.start();
		Thread.sleep(2000);
		Thread_is_Alive_Or_Not_test24 t3=new Thread_is_Alive_Or_Not_test24();
		System.err.println("main Method t3 state after object Creation::-"+t3.isAlive());
		t3.start();
		Thread.sleep(3000);
		
		
	System.err.println("main end");
	}

}
