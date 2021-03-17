package com.day8;

class Sample extends Thread{
	public void run() {
		System.out.println("Child Thread called");
	}
	
}

public class Example9 {

	public static void main(String[] args) {
		Sample s=new Sample();
		s.start();
		
		
		

	}

}
