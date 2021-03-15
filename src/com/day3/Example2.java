package com.day3;

class A{
	int i;
}
class B extends A{
	int i;
	B(int a,int b){
		i=a;
		super.i=b;
		
	}
	void show() {
		System.out.println("A class i is  "+super.i);
		System.out.println("B class i is  "+i);
	}
}

public class Example2 {

	public static void main(String[] args) {
		B b=new B(1,2);
		b.show();

	}

}
