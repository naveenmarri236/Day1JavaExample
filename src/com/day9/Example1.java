package com.day9;

class Q{
	int n;
	boolean valueSet=false;
	
	synchronized int get() {
		if(!valueSet) 
			try {
				wait();
			}
			catch(InterruptedException e) {
				System.out.println("Interrupted");
			}
			System.out.println("got : "+n);
			valueSet=false;
			notify();
			return n;
		

		
	}
	synchronized void put(int n) {
		if(valueSet){
			try {
				wait();
			}
			catch(InterruptedException e) {
				
			}
			this.n=n;
			valueSet=true;
			System.out.println("Put : "+n);
			notify();
		}
	}
}

class Producer implements Runnable{
	Q q;
	Thread t;
	Producer(Q q){
		this.q=q;
		t=new Thread(this,"Producer");
		t.start();
	}
	@Override
	public void run() {
		int i=0;
		while(true) {
			q.put(i++);
		}
	}

}

class Consumer implements Runnable{
	Q q;
	Thread t;
	Consumer(Q q){
		this.q=q;
		t=new Thread(this,"Consumer");
		t.start();
	}
	@Override
	public void run() {
		while(true) {
			q.get();
			
		}
	}
	
}

public class Example1 {

	public static void main(String[] args) {
		Q q=new Q();
		new Producer(q);
		new Consumer(q);
		System.out.println("press ctr+c to quite");
	}

}
