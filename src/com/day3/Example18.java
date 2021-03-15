package com.day3;

public class Example18 {

	public static void main(String[] args) {
		String s1=new String("hello");	//class
		String s2=new String("hello");	//class
		System.out.println(s1.equals(s2)); //true
		System.out.println(s1==s2);			//FALSE
		String s3=s2;
		System.out.println(s3==s2);  		//true
		
		String s4="hello";
		String s5="hello";
		System.out.println(s4.equals(s5));  //true
		// == works as .equals() ,if we are not using new operator
		System.out.println(s4==s5);			//true
	} 

}
