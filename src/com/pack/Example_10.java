package com.pack;

public class Example_10 {
	static int a=10;
	static int b;
	static {
		System.out.println("static block initialization");
		b=a*4;
	}
	static void meth(int x) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
	}

	public static void main(String[] args) {
		meth(42);
		

	}

}
