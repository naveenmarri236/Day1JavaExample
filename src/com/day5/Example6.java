package com.day5;

public class Example6 {
	static void demoA() {
		try {
			System.out.println("Inside demoA");
			throw new RuntimeException();
		}
		finally {
			System.out.println("Inside demoA finqlly ");
	
		}
	}
	static void demoB() {
		try {
			System.out.println("inside");
			return;
		}
		finally {
			System.out.println("inside final demoS ");
		}
	}
	static void demoC() {
		try {
			System.out.println("inside demoC");		
		}
		finally{
			System.out.println("inside final demoC");
		}
	}
	public static void main(String[] args) {
		try {
			demoA();
		}
		catch(RuntimeException e) {
			System.out.println("runtime exception");
		}
		demoB();
		demoC();
		
	}
}
