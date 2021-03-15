package com.day3;

public class Example19 {

	public static void main(String[] args) {
		Example19 e1=new Example19();
		e1=null;
		System.out.println("calling garbage collector");
		System.gc();

	}

	protected void finalize() {
		System.out.println("finalize method called");
	}
}
