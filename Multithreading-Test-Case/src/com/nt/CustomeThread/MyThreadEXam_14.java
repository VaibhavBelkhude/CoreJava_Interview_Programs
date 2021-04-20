package com.nt.CustomeThread;

public class MyThreadEXam_14 extends Thread{

	public void run() {
		for(int i=0;i<=10;i++) {
		System.out.println(getName()+"<--::Start run()"+i);
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
		MyThreadEXam_14 t1=new MyThreadEXam_14();
		System.err.println("main Method t1 state after object Creation::-"+t1.getState());
		t1.start();
		MyThreadEXam_14 t2=new MyThreadEXam_14();
		System.err.println("main Method t2 state after object Creation::-"+t2.getState());
		t2.start();
		Thread.sleep(2000);
		MyThreadEXam_14 t3=new MyThreadEXam_14();
		System.err.println("main Method t3 state after object Creation::-"+t3.getState());
		t3.start();
		Thread.sleep(3000);
		
		
	System.err.println("main end");
	}

}
