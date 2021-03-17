package com.day8;


class NewThread1 extends Thread{
	
	NewThread1(){
		super("DemoThread");
		System.out.println("child thread "+this);//Thread[Demothread,5,main]
		start();
	}
	
	public void run() {
		try {
			for(int i=5;i>0;i--) {
				System.out.println("Child thread "+i);
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e) {
			System.out.println("Chid thread interrupted");
		}
		System.out.println("Exiting child thread");

	}
}

public class Example5 {

	public static void main(String[] args) {
		NewThread1 n=new NewThread1();
		try {
			for(int i=5;i>0;i--) {
				System.out.println("Main Thread"+i);
				Thread.sleep(1000);
				
			}
		}
		catch(InterruptedException e) {
			System.out.println("main thread interrupted");
		}
	System.out.println("main thread exiting");
		
	}

}
