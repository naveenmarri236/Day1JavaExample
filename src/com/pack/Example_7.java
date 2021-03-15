package com.pack;

class OverloadDemo{
	void test() {
		System.out.println("No parameters ");
	}
	void test(int a) {
		System.out.println("a= "+a);
	}
	void test(int a,int b) {
		System.out.println("a= "+a+" b= "+b);
	}
	double test(double a) {
		return a*a;
	}
	
}
public class Example_7 {

	public static void main(String[] args) {
		
		OverloadDemo ob=new OverloadDemo();
		ob.test();
		ob.test(10);
		ob.test(10,20);
		ob.test(123.4);
		System.out.println(ob);
		
		
		

	}

}
