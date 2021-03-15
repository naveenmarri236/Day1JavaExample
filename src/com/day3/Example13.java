package com.day3;

abstract class A5{
	void show() {
		System.out.println("hello");
	}
}
public class Example13 {

	public static void main(String[] args) {
		A5 a=new A5(){
			public void show() {
				System.out.println("hellllooo");
			}
		};
		a.show();
	}

}
