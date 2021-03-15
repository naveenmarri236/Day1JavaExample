package com.day5;

abstract class A{
	
}
public class Example1 {

	public static void main(String[] args) throws Exception {
		Class c=Class.forName("A.class");
		A a=(A)c.newInstance();
		System.out.println(a);

	}

}
