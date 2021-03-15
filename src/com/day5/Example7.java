package com.day5;

public class Example7 {
	static void throwsDemo() throws NullPointerException{
		System.out.println("Inside throws Demo");
		throw new NullPointerException("demo");
	}
	public static void main(String[] args) {
		try {
			throwsDemo();
		
		}
		catch(NullPointerException e) {
			System.out.println("caught");
		}

	}

}
