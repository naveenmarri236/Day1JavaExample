package com.pack;
class A{
	A(){
		this(3.25f);
		System.out.println("1");
	}
	A(int a){
		this();
		System.out.println("2");
	}
	A(String s){
		this(5);
		System.out.println("3");
	}
	A(float f){
		System.out.println("4");
	}
}


public class Java_6 {

	public static void main(String[] args) {
		
		A a1=new A();
		A a2=new A(5);
		A a3=new A("Hello");
		A a4=new A(3.25f);
		
		
		
	}

}
