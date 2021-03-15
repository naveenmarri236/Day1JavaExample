package com.pack;

class Outer{
	static int var=100;
	/*void show() {
		Inner i=new Inner();
		i.display();
		
	}*/
	static class Inner{
		int x=10;
		void display() {
			System.out.println(x);
			System.out.println(var);
		}
		
	}
}

public class Example_12 {

	public static void main(String[] args) {
		/*Outer.Inner o=new Outer().new Inner();
		o.display();*/
		Outer.Inner o=new Outer.Inner();
		o.display();
	}

}
